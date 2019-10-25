import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape s1, Shape s2) {
        return s1.color.compareTo(s2.color);
    }


}
