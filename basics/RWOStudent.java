package basics;
class student{
    static  String collegeName;
    String name;
    int roll;
    long pno;
    String email;

    void display(){
        System.out.println("College Name:" + collegeName);
        System.out.println("Student Name:" + name);
        System.out.println("Student Roll:" + roll);
        System.out.println("Student Pno:" + pno);
        System.out.println("Student Email:" + email);

    }
}

class college{
   static void cse(){
        student s1=new student();
        student.collegeName="St. peters engineering College";
        s1.name="adhithya";
        s1.roll=6735;
        s1.pno=987654321L;
        s1.email="adhithya@gmail.com";
        s1.display();
    }
    static student csd(){
       student s2=new student();
       s2.name="akhil";
       s2.roll=3567;
       s2.pno=123456789L;
       s2.email="akhil@gmail.com";
       return s2;
    }



}


class RWOStudent {
    public static void main(String[] args) {
        System.out.println("------CSE STUDENT DETAILS------");
        college.cse();
        student obj = college.csd();
        System.out.println("------CSD STUDENT DETAILS------");
        obj.display();

    }
}