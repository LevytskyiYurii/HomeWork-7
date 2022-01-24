public class Rectangle extends Shape{

    public Rectangle() {
        this.shape = "Rectangle";
    }

    @Override
    void shapeName() {
        System.out.println("Created new " + shape);
    }
}
