package BusinessLayer.Enemies;

import BusinessLayer.Tiles.Unit;

import static java.lang.Math.random;

public class Monster extends Enemy{
    private int visionRange;

    public Monster(String name, int healthpool, int healthamount, int attackpoints, int defensepoints, int x, int y, char symbol, int experienceValue,int visionRange) {
        super(name, healthpool, healthamount, attackpoints, defensepoints, x, y, symbol, experienceValue);
        this.visionRange=visionRange;
    }

    public void movement(Unit player){
        int dx,dy;
        if(this.range(player)<visionRange){
            dx=this.getXcord()- player.getXcord();
            dy=this.getYcord()-player.getYcord();
            if(dx<0)
                dx=dx*-1;
            if(dy<0)
                dy=dy*-1;
            if(dx>dy){
                if(dx>0)
                    this.move(Movements.LEFT);
                else
                    this.move(Movements.RIGHT);
            }
            else{
                if(dy>0)
                    this.move(Movements.UP);
                else
                    this.move(Movements.DOWN);
            }
        }
        else{
            int randomize=(int)(random()*4);
            switch (randomize){
                case 0: this.move(Movements.NONE);
                break;
                case 1: this.move(Movements.LEFT);
                break;
                case 2: this.move(Movements.RIGHT);
                break;
                case 3: this.move(Movements.UP);
                break;
                case 4: this.move(Movements.DOWN);
                break;
                //Just for debugging;
                default:throw new IllegalArgumentException("Problem with math.random!");
            }
        }
    }
    public void move(Movements direction){
        switch (direction){
            case LEFT: this.setX(getXcord()-1);
            break;
            case DOWN: this.setY(getYcord()-1);
            break;
            case UP: this.setY(getYcord()+1);
            break;
            case RIGHT: this.setX(getXcord()+1);
            break;
            case NONE: break;
            //Just for debugging;
            default: throw new IllegalArgumentException("Illegal movement!");
        }
    }
}
