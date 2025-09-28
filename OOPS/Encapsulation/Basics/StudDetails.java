/*PS:Create a Student class that stores a student's name, roll number, and age as private fields.
 Provide public getter and setter methods for each field, then create a main method to
  instantiate a student, set values, and print all the details*/
package OOPS.Encapsulation.Basics;
class Students{
    private String name;
    private int roll;
    private int age;
    void setName(String name){
        this.name=name;
    }
    void setRoll(int roll){
        this.roll=roll;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return name;
    }
    int getRoll(){
        return roll;
    }
    int getAge(){
        return age;
    }
    void display(){
        System.out.println("Student Name:"+ name);
        System.out.println("Student Roll:"+ roll);
        System.out.println("Student Age:"+ age);
    }
}
public class StudDetails {
    public static void main(String[] args) {
        Students s1= new Students();
        s1.setName("Aditya");
        s1.setRoll(1);
        s1.setAge(20);
        s1.display();
    }
}
