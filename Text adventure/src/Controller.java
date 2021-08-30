import java.util.Scanner;

public class Controller {

    UI ui = new UI();

    public void mainMenu(){
    ui.displayGreen("Welcome to this labyrint game!\nYou need to find your way out of this labyrint "+
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
                    north();

                    break;
                case "W":
                    ui.displayGreen("You choose W");
                    break;
                case "S":
                    ui.displayGreen("You choose S");
                    break;
                case "E":
                    ui.displayGreen("You choose E");
                    break;
                case "Q":
                    System.out.println("You chosse to quit.. Goodbye!!");
                    System.exit(2);
                default:
                    System.out.println("Please maake a valid choose!! Try again!");


            }
        }

    } while(keepRunning ==true);

    }


    public void north(){


    }
    public void west(){


    }
    public void south(){


    }
    public void east(){


    }




}
