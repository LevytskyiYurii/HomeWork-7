public class Circle extends Shape {

    public Circle() {
        this.shape = "circle";
    }

    @Override
    void shapeName() {
        System.out.println("Created new " + shape);
    }
}
