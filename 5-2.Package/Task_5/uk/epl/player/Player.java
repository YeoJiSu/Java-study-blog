package uk.epl.player;

import javax.swing.text.Position;

public abstract class Player {
    private String name;
    private int jerseyNumber;

    private int[] abilities = new int[3];
    final int SPEED = 0;final int STAMINA = 1;final int PASSING = 2;
    public String state;

    public Player(String name, int jerseyNumber, int speed, int stamina, int passing){
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.abilities[SPEED] = speed;
        this.abilities[STAMINA]= stamina;
        this.abilities[PASSING]= passing;

    }
    Position position = new Position(0,0);

    public class Position{
        public int x;
        public int y;

        public Position(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public int getX(){
            return this.x;
        }
        public int getY(){
            return this.y;
        }

    }
    public void setPosition(int x,int y){
        position.x =x;
        position.y=y;
    }
    public Position getPosition(){
        return new Position(position.x, position.y);
    }
    public void moveUp(){
        float move_delta = getMoveDelta();
        position.y = (int)(position.y - move_delta);
        decreaseStamina();
    }
    public int getJerseyNumber(){ return this.jerseyNumber; }
    private void decreaseStamina(){
        abilities[STAMINA] = (int) (abilities[STAMINA]-2);
    }
    private float getMoveDelta(){
        return 1+getSpeed()/100 * getStamina()/100;
    }
    protected float getSpeed(){
        return (float)abilities[SPEED];
    }
    protected float getStamina(){ return (float) abilities[STAMINA]; }
    protected float getPassing(){return (float) abilities[PASSING];}
    @Override
    public String toString(){
        String format;
        format = String.format("Player Name='%s, JerseyNumber=%d Position (%d, %d) %s SPEED=%.1f, , STAMINA=%.1f, , PASSING=%.1f",
                this.name,
                this.jerseyNumber,
                position.getX(),
                position.getY(),
                this.state,
                this.getSpeed(),
                this.getStamina(),
                this.getPassing());
        return format;
    }
}
