public class Defender extends Player{
    private int SPEED_POINT = 10;

    @Override
    protected int getSpeed() {
        return super.speed-SPEED_POINT;
    }
    @Override
    public String toString(){
        return super.toString();
    }
}
