public class Rectangle {
    private Point leftTop;
    private Point rightBottom;

    public Rectangle(Point p1, Point p2){
        leftTop = new Point(p1.getX(), p1.getY());
        rightBottom = new Point(p2.getX(), p2.getY());
    }
    public Rectangle(Rectangle rectangle){
        // 여기 구현 시간 오래 걸리네
        Rectangle r = new Rectangle(rectangle.leftTop, rectangle.rightBottom);
        this.leftTop = r.leftTop;
        this.rightBottom = r.rightBottom;
    }
    public void moveBy(int x, int y){
        int x1 = leftTop.getX()+x;
        leftTop.setX(x1);
        leftTop.setY(leftTop.getY()+y);
        rightBottom.setX(rightBottom.getX()+x);
        rightBottom.setY(rightBottom.getY()+y);
    }
    @Override
    public String toString(){
        String format = String.format("Rectangle[(%d, %d), (%d, %d)]", leftTop.getX(), leftTop.getY(), rightBottom.getX(), rightBottom.getY());
        return format;
    }
}
