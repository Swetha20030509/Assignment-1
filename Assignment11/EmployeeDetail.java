package Assignment11;
class Employee
{
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public void display(Employee employee)
    {
        System.out.println("Employee Name :"+name);
        System.out.println("Employee Id :"+id);
        System.out.println(0);
    }
    public void display(HourlyEmployee hourlyEmployee)
    {
        System.out.println("Employee Name :"+name);
        System.out.println("Employee Id :"+id);
        System.out.println("Total hour work :"+hourlyEmployee.totalHour);
    }
    public void display(SalaryEmployee salaryEmployee)
    {
        System.out.println("Employee Name :"+name);
        System.out.println("Employee Id :"+id);
        System.out.println("Total Salary :"+salaryEmployee.totalSalary);
    }
}
class HourlyEmployee extends Employee
{
    int totalHour;

    public HourlyEmployee(String name, int id, int totalHour) {
        super(name, id);
        this.totalHour = totalHour;
    }

}
class SalaryEmployee extends Employee
{
    int totalSalary;

    public SalaryEmployee(String name, int id, int totalSalary) {
        super(name, id);
        this.totalSalary = totalSalary;
    }

}
public class EmployeeDetail {
    public static void main(String[] args) {
        Employee obj=new Employee("swetha",123);
        obj.display(obj);
        HourlyEmployee emp=new HourlyEmployee("swetha",9,10);
        emp.display(emp);
        SalaryEmployee emp1=new SalaryEmployee("swetha",5,10000);
       emp1.display(emp1);
    }
}
