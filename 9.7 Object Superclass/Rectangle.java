public class Rectangle
{
    private double length;
    private double width;
    
    public Rectangle(double l, double w) {
        length = l;
        width = w;
    }
    public boolean equals(Object rectangle) {
        if (rectangle == null) {
            return false;
        }
        return length == ((Rectangle)rectangle).length && width == ((Rectangle)rectangle).width;
    }

    public String toString() {
        return "This rectangle has a length of " + length + " and a width of " + width;
    }
}