public class Main
{
    public static void main(String[] args)
    {
        Rectangle shape = new Rectangle(2.5, 3.4);
        Rectangle shape2 = new Rectangle(2.5, 3.4);
        Rectangle shape3 = new Rectangle(3.4, 2.5);
        System.out.println(shape.equals(shape2));
        System.out.println(shape.equals(shape3));
        System.out.println(shape);
    }
}