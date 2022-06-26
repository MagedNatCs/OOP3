package BusinessLayer.Enemies;

import BusinessLayer.Tiles.Unit;

public abstract class Enemy extends Unit {
    protected  int experienceValue;

    public Enemy(String name, int healthpool, int healthamount, int attackpoints, int defensepoints, int x, int y, char symbol,int experienceValue) {
        super(name, healthpool, healthamount, attackpoints, defensepoints, x, y, symbol);
        this.experienceValue=experienceValue;
    }

    public int getHealthAmount() {
        return this.getHealthpool();
    }

    public int getEXP() {
        return experienceValue;
    }
}
