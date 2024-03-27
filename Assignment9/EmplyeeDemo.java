package Assignment9;

import java.util.Scanner;

class Employee
{
    private static String companyName="xyz company";
    private String employeeName;
    private String phoneNo;
    private String emailId;
    private double salary;

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }



    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public void setEmailId(String emailId)
    {
        this.emailId=emailId;
    }
    public String getEmployeeName() {
        return employeeName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public double getSalary() {
        return salary;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setSalary(double salary) {
        this.salary=salary;
    }
}
public class EmplyeeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        String employeeName=sc.nextLine();
        System.out.println("Enter the email id");
        String emailId= sc.nextLine();
        System.out.println("Enter the employee salary");
        double salary=sc.nextDouble();
        System.out.println("Enter the employee phoneNumber");
        String phoneNo= sc.nextLine();
        Employee employee=new Employee();
        employee.setEmployeeName(employeeName);
        employee.setEmailId(emailId);
        employee.setPhoneNo(phoneNo);
        employee.setSalary(salary);
        System.out.println("*************EMPLOYEE DETAIL**********");
        System.out.println("Company name :"+Employee.getCompanyName());
        System.out.println("Employee name :"+employee.getEmployeeName());
        System.out.println("Employee EmailId :"+employee.getEmailId());
        System.out.println("Employee PhoneNUmber:"+employee.getPhoneNo());
        System.out.println("Employee Salary:"+employee.getSalary());
    }
}
