public class Day
{
    private String day;
    private int temp;
    private boolean isSnowing;

    public Day(String d, int t, boolean s) {
        day = d;
        temp = t;
        isSnowing = s;
    }
    public int getTemp() {
        return temp;
    }
}