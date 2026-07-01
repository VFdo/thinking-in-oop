import java.util.Scanner;

import helper.ShapeInput;
import helper.ShapePrint;
import shape.Shape;
import shape.ShapeFactory;

public class Driver{
    public static void main(String[] args){
        ShapePrint print = new ShapePrint();
        ShapeInput input = new ShapeInput();
        ShapeFactory factory = new ShapeFactory();
        Scanner sc = new Scanner(System.in);
        Shape shape = null;

        try{
            System.out.println("Select a shape: \n\t1. Square\n\t2. Rectangle\n\t3. Circle");
            int shapeSelection = sc.nextInt();

            switch (shapeSelection) {
                case 1:
                    shape = factory.createSquare(input.lengthInput());
                    break;
                case 2:
                    shape = factory.createRectangle(
                        input.heightInput(), 
                        input.widthInput()
                    );
                    break;
                case 3:
                    shape = factory.createCircle(input.radiusInput());
                    break;
                default:
                    System.out.println("Invalid Input! Try Again!");
                    System.exit(0);
            }
            print.printDetails(shape);
            sc.close();
        }
        catch(Exception ex){
            System.out.println("An error occured! Try Again!");
        }
    }
}