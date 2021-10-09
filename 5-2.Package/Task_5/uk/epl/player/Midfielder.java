package uk.epl.player;

public class Midfielder extends Player{
    private int PASSING_POINT = 10;
    public Midfielder(String name, int jerseyNumber, int speed, int stamina, int passing) {
        super(name, jerseyNumber,speed, stamina, passing);
        state="Midfielder";
    }
    @Override
    protected float getPassing(){
        return super.getPassing() + PASSING_POINT;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
