public class Rectangle extends Shape {
    private double aside;
    private double bside;

    public Rectangle(double aside, double bside) {
        super("Rectangle", "Red");
        this.aside = aside;
        this.bside = bside;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "Red" +
                ", aside=" + aside +
                ", bside=" + bside +
                '}';
    }

    @Override
    double calculateSquare() {
        return aside * bside;
    }

}
