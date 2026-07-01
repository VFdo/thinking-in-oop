package shape;
public class Rectangle implements Shape{
    private int height;
    private int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String shapeInfo(){
        return "Height: " + height + "\nWidth: " + width;
    }

    @Override
    public int calcArea() {
        return height * width;
    }

    @Override
    public int calcPerimeter() {
        return 2 * height + 2 * width;
    }
}
