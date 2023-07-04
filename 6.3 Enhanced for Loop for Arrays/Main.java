public class Main
{
    public static void main(String[] args)
    {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};

        // Does not change the values stored in the array
        for (int digit: pi) {
            digit--;
        }
        for (int digit: pi) {
            System.out.print(digit);
        }
        System.out.println("\n");

        // Equivalent while, for, and enhanced for loops
        for (int digit: pi) {
            System.out.print(digit);
        }
        System.out.println("");
        for (int i = 0; i < pi.length; i++) {
            System.out.print(pi[i]);
        }
        System.out.println("");
        int i = 0;
        while (i < pi.length) {
            System.out.print(pi[i]);
            i++;
        }
    }
}