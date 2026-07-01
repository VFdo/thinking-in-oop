package employee;
public class FullTimeEmp implements Employee{
    private String name;
    private float monthlySalary;

    FullTimeEmp(String name, float salary){
        this.name = name;
        this.monthlySalary = salary;
    }

    @Override
    public String getType() {
        return "Full-Time";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float calculateSalary() {
       return monthlySalary;
    }

    @Override
    public String getDetails() {
        return "Monthly Salary: " + monthlySalary;
    }
}
