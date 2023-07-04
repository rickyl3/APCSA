public class Main
{
    public static int getNumPiano() {
        return Piano.getNumPiano();
    }
    public static int getNumKeys() {
        return Piano.getNumKeys();
    }
    public static void main(String[] args)
    {
        System.out.println("|--------------- 5.7 ---------------|");
        Piano piano1 = new Piano(88, 10, 15);
        System.out.println(getNumPiano());
        System.out.println(getNumKeys());
        Piano piano2 = new Piano(123, 13, 17);
        System.out.println(getNumPiano());
        System.out.println(getNumKeys());

        System.out.println("\n|--------------- 5.8 ---------------|");
        System.out.println(piano2.demonstrateWidth(18));
        System.out.println(piano2.getWidth());
        System.out.println(piano2.numTensKeys());
        System.out.println(piano2.numHundredsKeys());
        System.out.println(piano2.subtractTensByHundreds());
        System.out.println(piano1.getStr());
        System.out.println(piano2.getStr());
        Piano piano3 = new Piano(2341);
        System.out.println(piano3.getStr());
    }
}