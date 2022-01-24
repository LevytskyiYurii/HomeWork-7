public class Kite extends Shape{

    public Kite() {
        this.shape = "Kite";
    }

    @Override
    void shapeName() {
        System.out.println("Created new " + shape);
    }
}
