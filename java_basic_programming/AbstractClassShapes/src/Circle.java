public class Circle extends Shape  {
    private double rad;
    private static double pi = 3.14;

    public Circle(double rad) {
        super("Circle", "White");
        this.rad = rad;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "White" +
                ", rad=" + rad +
                '}';
    }

    @Override
    double calculateSquare() {
        return pi * (rad * rad);
    }

}
