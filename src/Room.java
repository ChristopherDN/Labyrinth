import java.util.ArrayList;

/**
 * @author roed
 */
public class Room {
  private String name;
  private boolean north;
  private boolean south;
  private boolean east;
  private boolean west;
  private Player player;

  public Room(String name, boolean north, boolean south, boolean east, boolean west) {
    this.name = name;
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
  }

  public Room(String name, boolean north, boolean south, boolean east, boolean west, Player player) {
    this.name = name;
    this.north = north;
    this.south = south;
    this.east = east;
    this.west = west;
    this.player =  player;
  }

  public Player getPlayer() {
    return player;
  }

  public void setPlayer(Player player) {
    this.player = player;
  }
}
