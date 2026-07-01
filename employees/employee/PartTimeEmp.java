package employee;
public class PartTimeEmp implements Employee{
    private String name;
    private int hoursWorked;
    private float hourlyRate;

    PartTimeEmp(String name, int hoursWorked, float hourlyRate){
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Part-Time";
    }

    @Override
    public float calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public String getDetails() {
        return "Hours Worked: " + hoursWorked + "\nHourly Rate: " + hourlyRate;
    }
}
