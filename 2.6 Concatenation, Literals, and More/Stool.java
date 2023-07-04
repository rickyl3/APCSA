public class Stool
{
        private int numLegs;
        private double height; //feet
        private String mainColor;
        private String material;
        private boolean isRound;

public Stool(int l, double h, String c, boolean r)
    {
        numLegs = l;
        height = h;
        mainColor = c;
        isRound = r;
    }
public Stool(int l, double h)
    {
        numLegs = l;
        height = h;
    }
public void addLeg()
    {
        numLegs++;
        System.out.println("This stool has " + numLegs + " legs.");
    }
public void addHeight()
    {
        height = height + 0.1;
        System.out.println("This stool is " + height + " feet tall.");
    }
public void setProperties(int l, double h, String c)
    {
        numLegs = l;
        height = h;
        mainColor = c;
        System.out.println("This stool is now " + height + " feet tall, the color " + mainColor + ", and has " + numLegs + " legs.");
    }
public void setProperties(double h, String c)
    {
        height = h;
        mainColor = c;
        System.out.println("This stool is now " + height + " feet tall and the color " + mainColor + ".");
    }
public String changeToBlue()
    {
        return mainColor = "blue";
    }
public String changeColor(String c)
    {
        return mainColor = c;
    }
}