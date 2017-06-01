package examples;

public class Interest4 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        double principal = 0.0, rate = 0.0, payment = 0.0;

        System.out.print("\nEnter the principal amount of the loan ");
        System.out.print("(such as 120000): ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate for the loan ");
        System.out.print("(such as 7.5): ");
        rate = scanner.nextDouble();
        scanner.close();

        printHeading();
        payment = calculatePayment(principal, rate);
        printPayment(principal, rate, payment);
        System.out.println("\nTry some other rates:");

        printHeading();
        payment = calculatePayment(principal, rate - .5);
        printPayment(principal, rate - .5, payment);
        payment = calculatePayment(principal, rate + .5);
        printPayment(principal, rate + .5, payment);
    }

    public static void printHeading() {
        System.out.println(
                "\nPrincipal\t\tInterest Rate\t\tMonthly Payment");
        System.out.println(
                "---------\t\t-------------\t\t---------------");
    }

    public static void printPayment(double princ, double rate,
            double pay) {
        System.out.println(princ + "\t\t\t" + rate + "\t\t\t" + pay);
    }

    public static double calculatePayment(double princ, double rate) {
        double pay = 0.0;
        pay = (princ + 30 * princ * (rate / 100)) / (30 * 12);
        return pay;
    }
}
