public class Animal
{
    private double weight;
    public Animal(double w) {
        weight = w;
    }
    public void loseWeight(double l) {
        weight -= l;
    }
    public double getWeight() {
        return weight;
    }
}