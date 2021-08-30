import java.util.ArrayList;

public class Labyrinth {

    public void createLabyrinth(Player player) {
        Room[] labyrinth = {new Room("The Great Hall", true, false, false, false,player),
                new Room("The Dark Room", false, true, true, false),
                new Room("The Red Room", false, true, false, true),
                new Room("The Courtyard", true, false, true, false)};
    }

    public char greatHall(char way, UI ui) {
        ui.displayGreen("You have entered the first room: The Great Hall");
        ui.getString();
        if (way == 'n' || way == 'N') ;
        return way;
    }

    public char darkRoom(char way, UI ui) {
        ui.displayGreen("You have entered the second room: The Dark Room");
        ui.getString();
        if (way == 'w' || way == 'W') ;
        return way;
    }

    public char lightRoom(char way, UI ui) {
        ui.displayGreen("You have entered the third room: The Red Room");
        ui.getString();
        if (way == 's' || way == 'S') ;
        return way;
    }

    public char courtyard(char way, UI ui) {
        ui.displayGreen("You have entered the last room: The Courtyard");
        ui.getString();
        if (way == 'e' || way == 'E') ;
        return way;
    }

}
