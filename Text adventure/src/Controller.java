import java.util.Scanner;

public class Controller {

  public static void main(String[] args) {

    System.out.println("Welcome to this labyrint game!\nYou need to find your way out of this labyrint " +
            "by choosing your direction.");
    boolean keepRunning = true;
    do {

       {

        System.out.println("Choose your direction:\nN = North\nW = West\nS = South\nE = east\nPress Q for quit\n\n" +
                "Please choose: ");

        Scanner sc = new Scanner(System.in);

        String choose = sc.nextLine();

        switch (choose) {
          case "N":
            System.out.println("You choose N");
            break;
          case "W":
            System.out.println("You choose W");
            break;
          case "S":
            System.out.println("You choose S");
            break;
          case "E":
            System.out.println("You choose E");
            break;
          case "Q":
            System.out.println("You chosse to quit.. Goodbye!!");
            System.exit(2);
          default:
            System.out.println("Please maake a valid choose!! Try again!");


        }
      }

    } while (keepRunning == true);

      }

}
