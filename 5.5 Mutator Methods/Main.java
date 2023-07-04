public class Main
{
    public static void main(String[] args)
    {
        Fluid first = new Fluid(54, "blood");
        Fluid second = new Fluid(30, "water");
        Bottle bottle = new Bottle(first, 1000);
        System.out.println(first + "\n");
        System.out.println(second + "\n");
        System.out.println(bottle + "\n");

        System.out.println(second.isColderThan(first));
        System.out.println(first.isColderThan(second));

        first.setName("Apple Juice");
        System.out.println(first.getName());
    }
}