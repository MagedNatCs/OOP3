package BusinessLayer.Enemies;

import BusinessLayer.Tiles.Unit;

public class Trap extends Enemy{
    private int visibilityTime;
    private int invisibilityTime;
    private int ticksCount=0;
    private boolean visible=true;

    public Trap(String name, int healthpool, int healthamount, int attackpoints,
                int defensepoints, int x, int y, char symbol, int experienceValue,int visibilityTime,int invisibilityTime) {
        super(name, healthpool, healthamount, attackpoints, defensepoints, x, y, symbol, experienceValue);
        this.visibilityTime=visibilityTime;
        this.invisibilityTime=invisibilityTime;
    }


    public void updateState(){
        if(visible){
            if(visibilityTime==ticksCount){
                visible=false;
                ticksCount=0;
            }
            else
                ticksCount++;
        }
        else{
            if(invisibilityTime==ticksCount){
                visible=true;
                ticksCount=0;
            }
            else
                ticksCount++;
        }
    }
    public boolean attack(Unit player){
        if(this.range(player)<2){
            //attack
            return true;
        }
        else return false;
    }
}
