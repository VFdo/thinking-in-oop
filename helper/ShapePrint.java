package helper;
import shape.Shape;

public class ShapePrint {

    private void print(String value){
        System.out.println(value);
    }
    
    public void printDetails(Shape shape){
        print("*************************");
        print("Shape: " + shape.getName());
        print("Properties:");
        print(shape.shapeInfo());
        System.out.println();        
        print("Area: " + shape.calcArea());
        print("Perimeter: " + shape.calcPerimeter());
        print("*************************");
    }
}
