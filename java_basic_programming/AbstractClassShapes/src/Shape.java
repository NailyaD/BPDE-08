public abstract class Shape implements Comparable<Shape> {
    String displayName;
    String color;

    public Shape(String displayName, String color)
    {
        this.displayName = displayName;
        this.color = color;
    }

    abstract double calculateSquare();

    public int compareTo(Shape o) {
        if (this.calculateSquare() > o.calculateSquare())
            return 1;
        else if (this.calculateSquare() < o.calculateSquare())
            return -1;
        else
            return 0;
    }
}
