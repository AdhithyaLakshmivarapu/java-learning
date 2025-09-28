/*PS: Implement a Rectangle class with private fields length and breadth.
Validate that both values are positive in setters. Add methods getArea() and getPerimeter()
to compute the rectangle's area and perimeter. 
Bonus: Create a setDimensions() method that changes both length and breadth together safely. */
package OOPS.Encapsulation.Medium;

public class Rectangle {
    private int length;
    private int breadth;
    public void setLength(int length){
        if (length<=0) {
            System.out.println("Enter Valid Length");
        }
        else{
            this.length=length;
        }
    }public void setBreadth(int breadth){
        if (breadth<=0) {
            System.out.println("Enter Valid Breadth");
        }
        else{
            this.breadth=breadth;
        }
        
    }
    public void setDimensions(int length, int breadth){
            if (length<=0 || breadth<=0) {
                System.out.println("Invalid Lenghth and Breadth");
            }else{
                this.length=length;
                this.breadth=breadth;
            }
        }     
    public int getArea(){
        return length*breadth;
    }
    public int getPerimeter(){
        return 2*(length+breadth);
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    void display(){
        System.out.println("Length:"+ length);
        System.out.println("Breadth:"+ breadth);
        System.out.println("Area="+getArea());
        System.out.println("Perimeter="+ getPerimeter());
    }
    
}
class TestRectangle{
    public static void main(String[] args) {
        Rectangle r1= new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.setLength(7);
        r1.setBreadth(12);
        System.out.println("---1st Rectangle---");
        r1.display();
        System.out.println("---2nd Rectangle---");
        r2.setLength(4);
        r2.setBreadth(8);
        r2.display();
        Rectangle r3 = new Rectangle();
        r3.setDimensions(12, 10);
        System.out.println("---3rd Rectangle---");
        r3.display();

    }
}
