public class Food
{
    private double amount; //oz

    public Food(double amount) {
        this.amount = amount;
    }
    public boolean hasMoreThan(Food compare) {
        return this.getAmount() > compare.getAmount();
    }
    public void consume(double e) {
        if (e > amount) {
            System.out.println("You don't have enough");
        }
        else {
            amount -= e;
        }
    }
    public double getAmount() {
        return amount;
    }
}