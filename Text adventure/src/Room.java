/**
 * @author roed
 */
public class Room {
  private String name;
  private int value;
  private boolean north;
  private boolean south;
  private boolean east;
  private boolean west;

  public Room(String name, int value, boolean north, boolean south, boolean east, boolean west) {
    this.name = name;
    this.value = value;
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
  }

}
