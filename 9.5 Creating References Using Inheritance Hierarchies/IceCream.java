public class IceCream extends Food
{
    private String flavor;
    private double sugarAmount; //grams

    public IceCream(String f, double a) {
        super(a);
        flavor = f;
    }
    public IceCream(String f, double s, double a) {
        super(a);
        flavor = f;
        sugarAmount = s;
    }
}