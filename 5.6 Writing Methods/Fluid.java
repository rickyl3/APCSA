public class Fluid
{
    private int temperature; //Fahrenheit
    private String fluidName;

    public Fluid(int t, String f) {
        temperature = t;
        fluidName = f;
    }
    public int getTemp() {
        return temperature;
    }
    public String getName() {
        return fluidName;
    }
    public void setTemp(int t) {
        temperature = t;
    }
    public void setName(String n) {
        fluidName = n;
    }
    public boolean isColderThan(Fluid other) {
        return (temperature < other.getTemp());
    }
    public String toString() {
        return "Name: " + fluidName + "\nTemperature: " + temperature;
    }
}