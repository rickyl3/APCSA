public class Main
{
    public static void main(String[] args)
    {
        Fluid blood = new Fluid(54, "blood");
        Fluid water = new Fluid(30, "water");
        Bottle bottle = new Bottle(blood, 1000);
        System.out.println(blood + "\n");
        System.out.println(bottle + "\n");

        System.out.println(water.isColderThan(blood));
        System.out.println(blood.isColderThan(water));
    }
}