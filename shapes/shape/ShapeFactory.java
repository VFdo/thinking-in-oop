package shape;

public class ShapeFactory{
    public Shape createSquare(int length){
        return new Square(length);
    }

    public Shape createRectangle(int height, int width){
        return new Rectangle(height, width);
    }

    public Shape createCircle(int radius){
        return new Circle(radius);
    }
}