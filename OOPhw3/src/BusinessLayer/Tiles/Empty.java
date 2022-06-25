package BusinessLayer.Tiles;


import BusinessLayer.Visitor;

public class Empty extends Tile {

    public final char symbol = '.';
    public Empty(int x , int y){
        super(symbol, x, y);
    }


    @Override
    public String toString() {
        return  String.valueOf(symbol);
    }

    @Override
    public void accept(Visitor v){v.visit(this);}

}
