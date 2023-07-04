public class NestedIteration
{
    public static void triangle(int size) {
        String space = "";
        String base = "";
        for (int i = 0; i < size; i++) {
            for (int x = i; x < size; x++) {
                System.out.print(" ");
            }
            System.out.println("/" + space + space + "\\");
            if (i == (size - 1)) {
                System.out.println("/" + base + "__\\");
            }
            space += " ";
            base += "__";
        }
    }
    public static void main(String[] args)
    {
        triangle(6);
        triangle(3);
    }
}
 