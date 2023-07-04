public class iPhone9 extends Phone
{
    private boolean exist;

    public iPhone9() {
        exist = false;
    }

    public iPhone9(double l, double w) {
        super(l, w);
        exist = false;
    }

    public boolean exist() {
        return exist;
    }
}