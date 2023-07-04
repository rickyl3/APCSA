public class Piano
{
    public static int numPiano;
    private static int numKeys;
    private int keys;
    private double width;
    private double length;
    private String str;

    // Local variables in different constructors;
    public Piano(int k, double w, double l) {
        String str = "This piano is " + w + " feet wide, " + l + " feet long, and has " + k + " keys."; 
        numPiano++;
        numKeys += k;
        keys = k;
        width = w;
        length = l;
        this.str = str;
    }
    public Piano(int k) {
        String str = "This piano has " + k + " keys.";
        numPiano++;
        numKeys += k;
        keys = k;
        this.str = str;
    }

    public String pianoStr() {
        return str;
    }

    // Local variables in different methods
    public int numTensKeys() {
        int value = keys / 10;
        return value;
    }
    public int numHundredsKeys() {
        int value = keys / 100;
        return value;
    }

    // Calling a method within a method
    public int subtractTensByHundreds() {
        return numTensKeys() - numHundredsKeys();
    }

    // Mutators and accessors
    public static int getNumPiano() {
        return numPiano;
    }
    public static int getNumKeys() {
        return numKeys;
    }
    public int getKeys() {
        return keys;
    }
    public double getWidth() {
        return width;
    }
    // Demonstration of same name but different value when compared to the instance variable
    public double demonstrateWidth(double w) {
        double width = w;
        return width;
    }
    public double getLength() {
        return length;
    }
    public String getStr() {
        return str;
    }
    public static void setNumPiano(int p) {
        numPiano = p;
    }
    public static void setNumKeys(int k) {
        numKeys = k;
    }
}