public class Triangle extends Shape{

    public Triangle() {
        this.shape = "Triangle";
    }

    @Override
    void shapeName() {
        System.out.println("Created new " + shape);
    }
}
