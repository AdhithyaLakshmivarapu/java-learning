package basics;
class Employee{
    String name;
    int age;
    String dept;
    double sal;
}

class company{
    static void display(Employee e1){
        System.out.println("Name Of The Employee:\t\t\t\t\t"+ e1.name);
        System.out.println("Age Of The Employee:\t\t\t\t\t"+ e1.age);
        System.out.println("Department:\t\t\t\t\t\t\t\t"+ e1.dept);
        System.out.println("Annual Salary Of THe Employee: \t\t\t"+ e1.sal);
    }
    static void annSal(Employee e1){
        System.out.println("-----------------------");
        System.out.println("Annual Salary: \t\t\t\t\t\t\t"+ e1.sal);
        System.out.println("-----------------------");
    }

    static double inrSal(Employee e1, int per){
        e1.sal = e1.sal + (e1.sal * per/100.0);
        return e1.sal;
    }



}



class RWOEmployee{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name="Adhithya";
        e1.age=20;
        e1.dept="SoftWare";
        e1.sal=200000D;
        company.display(e1);
        company.annSal(e1);
        System.out.println("Salary After increment: \t\t\t"+ company.inrSal(e1,20));
    }
}


