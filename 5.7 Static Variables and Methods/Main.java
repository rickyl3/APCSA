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
        Piano piano1 = new Piano(88, 10, 15);
        System.out.println(getNumPiano());
        System.out.println(getNumKeys());
        Piano piano2 = new Piano(123, 13, 17);
        System.out.println(getNumPiano());
        System.out.println(getNumKeys());
    }
}