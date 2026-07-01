package helper;
import java.util.Scanner;

public class DetailsInput {
    Scanner sc = new Scanner(System.in);

    private void getInput(String value){
        System.out.println("Enter " + value + ":");

    }

    public String nameInput(){
        getInput("Name");
        return sc.next();
    }

    public float salaryInput(){
        getInput("Monthly Salary");
        return sc.nextFloat();
    }

    public int hoursWorked(){
        getInput("Hours Worked");
        return sc.nextInt();
    }

    public float hourlyRate(){
        getInput("Hourly Rate");
        return sc.nextFloat();
    }

    public float projectFee(){
        getInput("Project Fee");
        return sc.nextFloat();
    }
}
