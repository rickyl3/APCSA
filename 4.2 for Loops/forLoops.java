public class forLoops
{
   public static void main(String[] args)
   {
        int count = 0;
        for (int i = 0; i < 60; i += 3) {
            count++;
        }
        System.out.println("There are " + count + " multiples of 3 in 60");
        
        count = 0;
        int i = 0;
        while (i < 60) {
            count++;
            i += 3;
        }
        System.out.println("There are " + count + " multiples of 3 in 60");
        
        System.out.println("============================================");
        // This code would print that there will be 21 multiples of 3 instead of the actual 20.
        // This occurs because the for loop is set to stop when i is less than OR EQUAL TO, rather than just less than. This leads to an off-by-one error.
        count = 0;
        for (i = 0; i <= 60; i += 3) {
            count++;
        }
        System.out.println("There are " + count + " multiples of 3 in 60");
   }
   
}




