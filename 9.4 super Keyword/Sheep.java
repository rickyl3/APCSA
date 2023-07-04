public class Sheep extends Animal
{
    private boolean isSheared;
    public Sheep(double w, boolean s) {
        super(w);
        isSheared = s;
    }
    public double getWeight() {
        return super.getWeight();
    }
}
