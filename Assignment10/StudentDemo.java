package Assignment10;
class Student
{
    String name;
    String mobileNo;

    public Student(String name, String mobileNo) {
        this.name = name;
        this.mobileNo = mobileNo;
    }
}
class ZsgsStudent extends Students
{
    String ZsgsEmail;
    int ageLimit;

    public ZsgsStudent(String name,String PhoneNumber,String zsgsEmail, int ageLimit) {
      super(name,PhoneNumber);
        ZsgsEmail = zsgsEmail;
        this.ageLimit = ageLimit;
    }
}
public class StudentDemo {
    public static void main(String[] args) {
        ZsgsStudent student=new ZsgsStudent("swetha","12346","fd.@gmail.com",23);
    }
}
