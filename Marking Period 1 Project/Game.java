public class Game
{
    private String name;
    private int bottles;
    private int cans;
    private int firstAidKits;
    private int games;

    public Game(String n, int b, int c, int f, int g) {
        name = n;
        bottles = b;
        cans = c;
        firstAidKits = f;
        games = g;
    }
    public Game(int b, int c, int f, int g) {
        name = null;
        bottles = b;
        cans = c;
        firstAidKits = f;
        games = g;
    }
    public Game(int b, int c) {
        name = null;
        bottles = b;
        cans = c;
    }

    public String getName() {
        return name;
    }
    public int getBottles() {
        return bottles;
    }
    public int getCans() {
        return cans;
    }
    public int getKits() {
        return firstAidKits;
    }
    public int getGames() {
        return games;
    }

    public void addBottles(int a) {
        this.bottles += a;
    }
    public void addCans(int a) {
        this.cans += a;
    }
    public void addFirstAidKits(int a) {
        this.firstAidKits += a;
    }
    public void addGames(int a) {
        this.games += a;
    }

    public static String prompt1(int int1, int int2) {
        return "If String str = \"supercalifragilisticexpialidocious\"(length is 34), what is the value of str.substring(" + int1 + ", " + int2 + ")?";
    }
    public static String prompt1(int int1) {
        return "If String str = \"supercalifragilisticexpialidocious\"(length is 34), what is the value of str.substring(" + int1 + ")?";
    }
    public static String prompt2(int base, int exponent) {
        return "What is the value of Math.pow(" + base + ", " + exponent + ")?";
    }
    public static String prompt3(int digits) {
        return "What are the first " + digits + " digits of the max integer value?";
    }
    public static String prompt4(int a, int max, int interval) {
        return "What is the output of:  \nfor(int i = " + a + "; i <= " + max + "; " + "i += " + interval + ") { \n    System.out.print(i + \" \");\n   }";
    }

    public String toString() {
        return "Items: " + bottles + " water bottles, " + cans + " cans of food, " + firstAidKits + " first aid kits, " + games + " games";
    }
}