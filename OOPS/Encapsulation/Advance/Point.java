/*PS:Implement a Point class representing a point in 2D space with private final fields x and y. 
Do not provide setters. Include a method move(int dx, int dy) that returns
a new Point object shifted by the given values, leaving the original point unchanged.
Bonus: Demonstrate how immutability is enforced via encapsulation. */
package OOPS.Encapsulation.Advance;

public class Point {
    private final int x;
    private final int y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    //getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public Point move(int dx, int dy){
        return new Point(this.x+dx, this.y+dy);
    }
    
}
class TestPoint{
    public static void main(String[] args) {
        Point p1=new Point(5, 8);
        System.out.println("Original X and Y values:"+ p1.getX()+" "+ p1.getY());
        Point p2=p1.move(2, 9);
        System.out.println("Original X and Y values:"+ p2.getX()+" "+ p2.getY());
    }
}
