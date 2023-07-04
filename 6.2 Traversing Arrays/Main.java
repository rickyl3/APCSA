public class Main
{
    public static void main(String[] args)
    {
        double[] pi = {3, 0.1, 0.04, 0.001, 0.0005};
        
        double result = 0;
        for (int i = 0; i < pi.length; i++) {
            result = result + pi[i];
        }
        System.out.println(result + "\n");

        int i = pi.length - 1;
        while (i > -1) {
            System.out.println(pi[i]);
            i--;
        }
        System.out.println("");

        // Off by one error
        i = 0;
        while (i <= pi.length) {
            System.out.println(pi[i]);
            i++;
        }
    }
}