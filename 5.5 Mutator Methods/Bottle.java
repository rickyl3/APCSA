public class Bottle
{
    private int milliliters;
    private Fluid liquid;

    public Bottle(Fluid f, int m) {
        liquid = new Fluid(f.getTemp(), f.getName());
        milliliters = m;
    }
    public int liquidTemp() {
        return liquid.getTemp();
    }
    public String liquidName() {
        return liquid.getName();
    }
    public Fluid getLiquid() {
        return liquid;
    }
    public void setMil(int m) {
        milliliters = m;
    }
    public String toString() {
        return "This bottle contains " + milliliters + " milliliters of: \n" + getLiquid();
    }
}