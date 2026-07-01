package employee;

public class EmployeeFactory {

    public Employee createFullTimeEmp(String name, float monthlySalary){
        return new FullTimeEmp(name, monthlySalary);
    }

    public Employee createPartTimeEmp(String name, int hoursWorked, float hourlyRate){
        return new PartTimeEmp(name, hoursWorked, hourlyRate);
    }

    public Employee createFreelancer(String name, float projectFee){
        return new Freelancer(name, projectFee);
    }
    
}
