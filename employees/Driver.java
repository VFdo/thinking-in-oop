import java.util.Scanner;

import employee.Employee;
import employee.EmployeeFactory;
import helper.DetailsInput;
import helper.EmployeePrint;

public class Driver {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        EmployeeFactory factory = new EmployeeFactory();
        DetailsInput input = new DetailsInput();
        Employee employee = null;

        try{
            System.out.println("Select Employee Type:\n\t1. Full-Time\n\t2. Part-Time\n\t3. Freelance");
            int type = sc.nextInt();
            String name = input.nameInput();
            
            switch (type) {
                case 1:
                    employee = factory.createFullTimeEmp(name, input.salaryInput());
                    break;
                case 2:
                    employee = factory.createPartTimeEmp(name, input.hoursWorked(), input.hourlyRate());
                    break;
                case 3:
                    employee = factory.createFreelancer(name, input.projectFee());
                    break;
                default:
                    System.out.println("Invalid Input! Try Again!");
                    System.exit(0);
            }

            EmployeePrint.print(employee);
            sc.close();
        }
        catch(Exception ex){
            System.out.println("An error occured! Try Again!");
        }
    }
}
