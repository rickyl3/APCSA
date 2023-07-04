public class Main 
{
    public static void main(String[] args)
    {
        Stool s = new Stool(4, 2.5, "Brown", true);
        System.out.println(s);
        s.addLeg();
        s.addHeight();
        s.setProperties(3, 2.25, "black");
        s.setProperties(2, "purple");
        String afterChange = s.changeToBlue();
        System.out.println("This stool is now the color " + afterChange + ".");
        System.out.println("This stool is now the color " + s.changeColor("green") + ".");

        String x = "\nYour stool is ";
        String r = "rusting";
        String d = "derusting";
        System.out.print(x + r);
        System.out.print(x + d);
        r += " :(";
        d += "!";
        System.out.print(x + r);
        System.out.print(x + d);
        System.out.print("\nI'm going to " + "\"upgrade\" my stool." + " \\o/");
    }
}