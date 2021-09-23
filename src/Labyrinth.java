
public class Labyrinth {
    UI ui = new UI();
    Room[] labyrinth;

    public void createLabyrinth(Player player) {
        labyrinth = new Room[] {new Room("The Great Hall", true, false, false, false, player),
                new Room("The Dark Room", false, true, true, false),
                new Room("The Red Room", false, true, false, true),
                new Room("The Courtyard", true, false, true, false)};
    }

    public void greatHall(UI ui) {
        ui.displayGreen("You have entered the first room: The Great Hall, find your way out!");
    }

    public void darkRoom(UI ui) {
        ui.displayGreen("You have entered the second room: The Dark Room, see if you can find the way!");
    }

    public char lightRoom(char way, UI ui) {
        ui.displayGreen("You have entered the third room: The Red Room");
        return way;
    }

    public char courtyard(char way, UI ui) {
        ui.displayGreen("You have entered the last room: The Courtyard");
        return way;
    }


    public boolean move() {

        return false;
    }
}





