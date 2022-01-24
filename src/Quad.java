public class Quad extends Shape{

    public Quad(){
        this.shape = "Quad";
    }

    @Override
    void shapeName() {
        System.out.println("Created new " + shape);
    }
}
