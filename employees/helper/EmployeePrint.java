package helper;
import employee.Employee;

public class EmployeePrint {

    private static void print(String value){
        System.out.println(value);
    }
    
    public static void print(Employee employee){
        System.out.println();
        print("Name: " + employee.getName());
        print("Employee Type:" + employee.getType());
        print("Details\n" + employee.getDetails());
        print("Salary: " + employee.calculateSalary());
    }
}
