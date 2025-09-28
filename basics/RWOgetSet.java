class Example{
    private int empNO;
    private String eName;
    private double sal;
    private String dept;

    void setEmpNO(int empNO){
        this.empNO=empNO;
    }
    void seteName(String eName){
        this.eName=eName;
    }
    void setSal(double sal){
        this.sal=sal;
    }
    void setDept(String dept){
        this.dept=dept;
    }
    int getEmpNO(){
        return empNO;
    }
    String geteName(){
        return eName;
    }
    double getSal(){
        return sal;
    }
    String getDept(){
        return dept;
    }

    void display(){
        System.out.println("---DETAILS OF EMPLOYEE---");
        System.out.println("Employee Name:"+ geteName());
        System.out.println("Employee No:"+ getEmpNO());
        System.out.println("Employee Salary:"+ getSal());
        System.out.println("Employee Department:" +getDept());
    }


}


class RWOgetset{
    public static void main(String[] args) {
        Example e1 =new Example();
        e1.seteName("Aditya");
        e1.setEmpNO(123);
        e1.setSal(120000.0d);
        e1.setDept("Java Developer");
        e1.display();



        Example e2 =new Example();
        e2.seteName("Akhil");
        e2.setEmpNO(124);
        e2.setSal(140000.0d);
        e2.setDept("Java Developer");
        e2.display();
    }

}