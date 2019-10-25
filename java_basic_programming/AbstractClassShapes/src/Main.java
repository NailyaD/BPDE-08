import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(20);
        Shape rectangle = new Rectangle(5, 10);
        Shape quadrat = new Quadrat(8);

        List<Shape> shapes = Arrays.asList(circle, rectangle, quadrat);
        System.out.println(totalSquare(shapes));

        if (circle.compareTo(rectangle) > 0) {
            System.out.println("Area of " + quadrat.displayName + " " + quadrat.calculateSquare() +
                               " is greater than area of " + rectangle.displayName + " " + rectangle.calculateSquare());
        } else {
            System.out.println("Area of " + quadrat.displayName + " " + quadrat.calculateSquare() +
                               " is less than area of " + rectangle.displayName + " " + rectangle.calculateSquare());
        }

        ShapeComparator pc = new ShapeComparator();
        System.out.println(pc.compare(circle, quadrat));

        Collections.sort(shapes);
        System.out.println(shapes.toString());

        Collections.sort(shapes, pc);
        System.out.println(shapes.toString());
    }

    public static double totalSquare(List<Shape> shapes) {
        double totalS = 0;
        for (Shape i : shapes) {
            totalS += i.calculateSquare();
        }
        return totalS;
    }


}
