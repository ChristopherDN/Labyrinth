public class Controller {

  UI ui = new UI();
  Labyrinth labyrinth = new Labyrinth();
    public void mainMenu() {
    ui.displayGreen("Welcome to this labyrinth game!\nYou need to find your way out of this labyrinth " +
        "by choosing your direction.");
    newGame();
    boolean keepRunning = true;
    do {
      ui.displayBlue("Choose your direction:\nN = North ↑\nW = West ←\nS = South ↓\nE = East →\nPress Q for quit\n\n" +
          "Please choose: ");
        // String choose = ui.getString();
        char choose = ui.getChar() ;
      switch (choose) {
        case 'N':
            {labyrinth.greatHall(choose);}
        break;
        case 'W':
          west();
          break;
        case 'S':
          south();
          break;
        case 'E':
          east();
          break;
        case 'Q':
          ui.errorRed("You chose to quit.. Goodbye!!");
          System.exit(2);
        default:
          ui.errorRed("Please maake a valid choice!! Try again!");
      }
    } while (keepRunning == true);
  }


public void west(){
    labyrinth.darkRoom('W',ui);
    }

public void south(){
    labyrinth.lightRoom('S',ui);
    }

public void east(){
    labyrinth.courtyard('E',ui);
    }
    public void newGame(){
      ui.errorRed("Enter you hero name for the quest ahead: ");
      Player player = new Player(ui.getString());
      labyrinth.createLabyrinth(player);
    }

    }
