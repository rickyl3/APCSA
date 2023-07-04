public class Piano
{
    public static int numPiano;
    private static int numKeys;
    private int keys;
    private double width;
    private double length;

    public Piano(int k, double w, double l) {
        numPiano++;
        numKeys += k;
        keys = k;
        width = w;
        length = l;
    }

    public int getKeys() {
        return keys;
    }
    public static int getNumPiano() {
        return numPiano;
    }
    public static int getNumKeys() {
        return numKeys;
    }
    public static void setNumPiano(int p) {
        numPiano = p;
    }
    public static void setNumKeys(int k) {
        numKeys = k;
    }
}