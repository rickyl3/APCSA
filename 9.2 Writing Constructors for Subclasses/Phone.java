public class Phone
{
    private double length;
    private double width;
    private boolean isNew;
    
    public Phone() {
        length = -1.1;
        width = -1.1;
        isNew = false;
    }

    public Phone(double l, double w) {
        length = l;
        width = w;
        isNew = true;
    }

    public double length() {
        return length;
    }
    public double width() {
        return width;
    }
    public boolean getCondition() {
        return isNew;
    }
    public void breakPhone() {
        isNew = false;
    }
}