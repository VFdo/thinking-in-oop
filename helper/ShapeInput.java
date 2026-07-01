package helper;
import java.util.Scanner;

public class ShapeInput {
    Scanner sc = new Scanner(System.in);

    private void propertyInput(String property){
        System.out.println("Enter the " + property + ":");
    }

    public int lengthInput(){
        propertyInput("side length");
        return sc.nextInt();
    }

    public int heightInput(){
        propertyInput("height");
        return sc.nextInt();
    }

    public int widthInput(){
        propertyInput("width");
        return sc.nextInt();
    }

    public int radiusInput(){
        propertyInput("radius");
        return sc.nextInt();
    }
}
