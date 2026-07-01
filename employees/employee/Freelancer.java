package employee;
public class Freelancer implements Employee{
    private String name;
    private float projectFee;

    Freelancer(String name, float projectFee){
        this.name = name;
        this.projectFee = projectFee;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return "Freelancer";
    }

    @Override
    public float calculateSalary() {
        return projectFee;
    }

    @Override
    public String getDetails() {
        return "Project Fee: " + projectFee;
    }

    
}
