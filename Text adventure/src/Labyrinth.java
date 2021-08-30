import java.util.ArrayList;
import java.util.Collection;

public class Labyrinth {
    UI ui = new UI();

    public void createLabyrinth(Player player) {
        Room[] labyrinth = {new Room("The Great Hall", true, false, false, false, player),
                new Room("The Dark Room", false, true, true, false),
                new Room("The Red Room", false, true, false, true),
                new Room("The Courtyard", true, false, true, false)};
    }

    public char greatHall(char choose) {
        if (choose == 'n' || choose == 'N') ;
        ui.displayGreen("You have entered the first room: The Great Hall");
        return choose;
    }

    public char darkRoom(char way, UI ui) {
        if (way == 'w' || way == 'W') ;
        ui.displayGreen("You have entered the second room: The Dark Room");
        return way;
    }

    public char lightRoom(char way, UI ui) {
        if (way == 's' || way == 'S') ;
        ui.displayGreen("You have entered the third room: The Red Room");
        return way;
    }

    public char courtyard(char way, UI ui) {
        if (way == 'e' || way == 'E') ;
        ui.displayGreen("You have entered the last room: The Courtyard");
        return way;
    }


    public boolean move() {

        return false;
    }
}





