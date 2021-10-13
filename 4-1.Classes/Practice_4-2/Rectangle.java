public class Rectangle {
    private Point p1;
    private Point p2;
    public Rectangle(Point p1, Point p2){
        this.p1=p1;
        this.p2=p2;
    }
    public void moveBy(int x, int y){
        int x1 = p1.getX();
        x1+=x;
        p1.setX(x1);
        int x2 = p2.getX();
        x2+=x;
        p2.setX(x2);
        int y1 = p1.getY();
        y1+=y;
        p1.setY(y1);
        int y2 = p2.getY();
        y2+=y;
        p2.setY(y2);
    }
    public void moveBy(int position){
        int x1 = p1.getX();
        int x2 = p2.getX();
        int y1 = p1.getY();
        int y2 = p2.getY();
        x1+=position;
        x2+=position;
        y1+=position;
        y2+=position;
        p1.setX(x1);
        p2.setX(x2);
        p1.setY(y1);
        p2.setY(y2);
    }
    @Override
    public String toString(){
        String format = String.format("Rectangle[(%d, %d), (%d, %d)]",p1.getX(),p1.getY(),p2.getX(),p2.getY());
        return format;
    }
}
