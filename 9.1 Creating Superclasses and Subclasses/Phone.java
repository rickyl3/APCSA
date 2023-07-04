public class Phone
{
    private double length;
    private double width;
    private boolean isNew;
    
    public Phone(double l, double w) {
        length = l;
        width = w;
        isNew = true;
    }

    public boolean getCondition() {
        return isNew;
    }
    public void breakPhone() {
        isNew = false;
    }
}