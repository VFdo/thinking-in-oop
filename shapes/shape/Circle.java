package shape;
public class Circle implements Shape{
    private int radius;
    private final int PI = 3; //assuming PI is 3 for simplicity

    Circle (int radius){
        this.radius = radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public String shapeInfo() {
        return "Radius:" + radius;
    }

    @Override
    public int calcArea() {
        return PI * radius * radius;
    }

    @Override
    public int calcPerimeter() {
        return 2 * PI * radius;
    }
}
