/*PS: Create an Employee class with private fields: name, age, and salary.
Ensure age is ≥ 18 and salary is positive using validation in setters.
Provide a method getAnnualSalary() that calculates and returns the yearly salary.
Test the class by creating multiple employees and printing their annual salaries. */
package OOPS.Encapsulation.Medium;

public class Employee {
    private String eName;
    private int age;
    private double salary;

    public void setEname(String eName){
        this.eName=eName;
    }
    public void setAge(int age){
        if (age>=18) {
            this.age=age;
        }else{
            System.out.println("Age Must Be Greater Than 18");
        }
    }
    public void setSalary(double salary){
        if (salary>0) {
            this.salary=salary;
        }else{
            System.out.println("Salary Must Be POsitive");
        }
    }
    public String getEname(){
        return eName;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    public double getAnnualSalary(){
        return salary*12;
    }
    void display(){
        System.out.println("Employee Name: "+ eName);
        System.out.println("Employee Age: "+ age);
        System.out.println("Employee Salary: "+ salary);
        System.out.println("Employee Annual Salary:"+ getAnnualSalary());
    }
}
class Test{
    public static void main(String[] args) {
        Employee e1= new Employee();
        Employee e2= new Employee();
        e1.setEname("Aditya");
        e1.setAge(20);
        e1.setSalary(110000.0d);
        System.out.println("-------Employee 1 Details-------");
        e1.display();        
        e2.setEname("Akhil");
        e2.setAge(20);
        e2.setSalary(100000.0d);
        System.out.println("-------Employee 2 Details-------");
        e2.display();
        
    }
}
