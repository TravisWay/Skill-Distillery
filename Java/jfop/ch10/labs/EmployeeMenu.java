import java.util.*;

public class EmployeeMenu{

static String Employee[] = new String[100];

 public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Employee Menu"+"\nEnter 1 for the Employee List \nEnter 2 to Hire/Add an Employee \nEnter 3 to Fire an Employee \n Enter 0 to Quit");
      int x = input.nextInt();

      switch (x) {
        case 0:
          System.out.println("Goodbye");
          break;
        case 1:
          List();
          break;
        case 2:
          System.out.println("Please enter a Employee Name to Hire: ");
          String name = input.next();
          Hire(name);
          break;
        case 3:
          System.out.println("Please enter a Employee Name to Fire: ");
          String name = input.next();
          Fire(name);
          break;
        default:
          System.out.println("Employee Menu"+"\nEnter 1 for the Employee List \nEnter 2 to Hire/Add an Employee \nEnter 3 to Fire an Employee \n Enter 0 to Quit");
          break;

      }

    }
      public static void List(){
        for(int i = 0; i < Employee.length; i++){
          System.out.println(Employee[i]);
        }
      }
      public static void Hire(String name){
        for(int i = 0; i < Employee.length; i++){
          if(Employee[i] == null){
            Employee[i] = name;
          }
        break;
        }
      }
        public static void Fire(String name){
          for(int i = 0; i < Employee.length; i++){
            if(Employee[i].equals(name)){
              Employee[i] = null;
            }
          break;
      }
 }






}