/*Create a Student class with private fields: name, marks (array of integers), and grade. 
When setting the marks, automatically calculate the grade using the following:

90+ → A, 80–89 → B, 70–79 → C, <70 → D.
Only provide getters for marks and grade. Test the class with multiple students. */
package OOPS.Encapsulation.Advance;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] marks;
    private char grade;
    public void setName(String name){
        this.name=name;
    }
    public void setMarks(int[] marks){
        this.marks= marks.clone();
        int sum=0;
        for (int i : marks) {
            sum+=i;
        }
        double avg = sum/(double) marks.length;
        
        if (avg>=90) {
          grade='A';  
        }else if (avg <90 && avg>=80) {
            grade='B';
        }else if (avg <80 && avg>=70) {
            grade='C';
        }else if (avg <70) {
            grade='D';
        }
    }
    public int[] getMarks(){
        return marks.clone();
    }
    public char getGrade(){
        return grade;
    }
    void display(){
        System.out.println("Name:"+ name);
        System.out.println("Grade="+ grade);
        System.out.println("Marks="+ Arrays.toString(marks));
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student s1= new Student();
        Student s2= new Student();
        s1.setName("Aditya");
        s1.setMarks(new int[] {70,80,90,95});
        s1.display();
        s2.setName("Akhil");
        s2.setMarks(new int[] {90,80,97,95});
        s2.display();
    }
}
