package demo;

import java.util.Scanner;

public class TicTac2 {

    static int j2 = 0;
    static String playerone = "X";
    static String playertwo = "O";
    static int counter = 0;
    static String[][] tictac = { { "| |", "| |", "| |" }, { "| |", "| |", "| |" }, { "| |", "| |", "| |" } };

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Game();

    }

    static void Game() {
        for (int i = 0; i < 5; i++) {
            PlayerTurn(playerone);
            Winnercheck(playerone);
            j2=0;
            PlayerTurn(playertwo);
            Winnercheck(playertwo);
        }
    }

    static void PlayerTurn(String Player) {
        Scanner input = new Scanner(System.in);
        System.out.println(Player + "\n" + "   What row would you like to place in:\n1\n2\n3");
        int row = input.nextInt() - 1;
        System.out.println("What column would you like to place in:(1,2,3)");
        int col = input.nextInt() - 1;
        while (!tictac[row][col].equals("| |")) {
            System.out.println("The space is occupied");
            System.out.println(Player + "\n" + "   What row would you like to place in:\n1\n2\n3");
            row = input.nextInt() - 1;
            System.out.println("What column would you like to place in:(1,2,3)");
            col = input.nextInt() - 1;
        }

        tictac[row][col] = ("|" + Player + "|");

        for (int i = 0; i < tictac.length; i++) {
            for (int j = 0; j < tictac.length; j++) {
                System.out.print(tictac[i][j]);
            }
            System.out.println();

        }
    }

    static void Winnercheck(String Player) {
        for (int j = 0; j < tictac.length; j++) {

            for (int j2 = 0; j2 < tictac.length; j2++) {
                if (tictac[j][j2].equals("|" + Player + "|")) {
                    counter++;
                    
                    if (counter >= 3) {
                        System.out.println("Goodbye");
                        System.exit(0);

                    }
                }
            }
            counter = 0;
        }
        for (int j = 0; j < tictac.length; j++) {

            for (int j2 = 0; j2 < tictac.length; j2++) {
                if (tictac[j2][j].equals("|" + Player + "|")) {

                    counter++;
                    if (counter >= 3) {
                        System.out.println("Goodbye");
                        System.exit(0);

                    }
                }
            }
            counter = 0;

        }
        j2 = 0;
        for (int j = 0; j < tictac.length; j++, j2++) {
            
            if (tictac[j][j2].equals("|" + Player + "|")) {

                counter++;

                if (counter >= 3) {
                    System.out.println("Goodbye");
                    System.exit(0);

                }
            }
        }
        counter = 0;
        j2 = 2;
        for (int j = 0; j < tictac.length; j++, j2--) {

            if (tictac[j2][j].equals("|" + Player + "|")) {

                counter++;
                if (counter >= 3) {
                    System.out.println("Goodbye");
                    System.exit(0);

                }
            }

        }
        counter = 0;
    }
}