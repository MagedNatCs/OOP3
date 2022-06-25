package BusinessLayer.Tiles;


public abstract class Unit extends Tile {

    private string name;

    public String describe() {
        return String.format("%s\t\tHealth: %s\t\tAttack: %d\t\tDefense: %d", getName(), getHealth(), getAttack(), getDefense());
    }
}
