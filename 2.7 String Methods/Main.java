public class Main 
{
    // 2.7 Challenge
    static void reverseOrder(String w)
    {
        int a = 0;
        while (a < w.length())
        {
            System.out.print(w.substring(w.length() - a - 1, w.length() - a));
            a++;
        }
    }
    // 2.7 Challenge
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
        System.out.println("\nI'm going to " + "\"upgrade\" my stool." + " \\o/");

        String message1 = ("This stool is the color " + s.toString() + ".");
        System.out.println(message1);
        System.out.println(message1.length());
        s.changeColor("red");
        String message2 = ("This stool is the color " + s.toString() + ".");
        System.out.println(message2.length());
        System.out.println(message1.substring(0, 10));
        System.out.println(message2.substring(24, 28));
        System.out.println(message1.substring(14));
        System.out.println(message2.indexOf("stool"));
        System.out.println(message2.indexOf("red"));
        System.out.println(message1.equals(message2));
        System.out.println(message1.compareTo(message2));
        
        // 2.7 Challenge
        reverseOrder("sfiopjasdfopasdf");
        // 2.7 Challenge
    }
}