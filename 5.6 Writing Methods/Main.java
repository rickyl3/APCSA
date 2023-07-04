public class Main
{
    // Method that does not modify Objects passed as a parameter
    public static int addMil(Fluid first, Fluid second) {
        return first.getTemp() + second.getTemp();
    }

    // Non-void method that receives values through a parameter and uses them
    public static int addMil(Fluid first, int mil) {
        return first.getTemp() + mil;
    }

    // Changes, and uses a mutable object and accesses it private data
    public static void numClosestToFreezing(Fluid first, Fluid second) {
        first.setTemp(first.getTemp() - 32);
        second.setTemp(second.getTemp() - 32);
        if (first.getTemp() <= 0 || second.getTemp() <= 0) {
            System.out.println("One of them are already below freezing");
        }
        else if (first.getTemp() < second.getTemp()) {
            System.out.println(first.getName() + " is closer to below freezing");
        }
        else if (second.getTemp() < first.getTemp()) {
            System.out.println(second.getName() + " is closer to below freezing");
        }
        else {
            System.out.println("They are the same distance from below freezing");
        }
    }
    public static void main(String[] args)
    {
        Fluid first = new Fluid(54, "blood");
        Fluid second = new Fluid(30, "water");
        System.out.println(first.getTemp());
        System.out.println(second.getTemp());
        System.out.println(addMil(first, second));
        numClosestToFreezing(first, second);
        System.out.println(first.getTemp());
        System.out.println(second.getTemp());
    }
}