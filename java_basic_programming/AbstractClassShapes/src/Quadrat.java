public class Quadrat extends Shape {
    private double aside;

    public Quadrat(double aside) {
        super("Quadrate", "Black");
        this.aside = aside;
    }

    @Override
    public String toString() {
        return "Quadrat{" +
                "Black" +
                ", aside=" + aside +
                '}';
    }

    @Override
    double calculateSquare() {
        return aside * aside;
    }

}
