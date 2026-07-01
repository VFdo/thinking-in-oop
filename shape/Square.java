package shape;
public class Square implements Shape {
    private int length;
    private final int sides = 3;

    public Square(int length){
        this.length = length;
    }

    @Override
    public String getName(){
        return "Square";
    }

    @Override
    public String shapeInfo(){
        return "Length: " + length;
    }

    @Override
    public int calcArea() {
        return length * length;
    }

    @Override
    public int calcPerimeter() {
        return length * sides;
    }   
}
