public class Rectangle implements MyComparable{
    private int x,y;
    public Rectangle(int x,int y){
        this.x= x;
        this.y= y;
    }
    public int compareTo(Object other) {
        if (!(other instanceof Rectangle)) return -2;
        Rectangle otherRectangle = (Rectangle) other;
        int returnValue = 0;
        int area=x*y;
        int otherArea= otherRectangle.x* otherRectangle.y;
        if (area < otherArea) returnValue = -1;
        if (area == otherArea) returnValue = 0;
        if (area > otherArea) returnValue = 1;
        return returnValue;
    }

    public boolean equal(Object other) {
        if (!(other instanceof Rectangle)) return false;
        Rectangle otherRectangle = (Rectangle) other;
        return x == otherRectangle.x && y == otherRectangle.y;
    }
    public String toString(){
        return String.format("Rectangle{area=%d}",this.x*this.y);
    }
}
