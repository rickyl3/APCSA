import java.util.*;

public class Main
{
   public static void main(String[] args)
   {
      ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(3, 7, 9, 14, 2, 0, 0, 7, 1, 9, 9, 2));
      int sum = 0;
      for (int i = 0; i < intList.size(); i++) { //Traversal with for loop
         sum += intList.get(i);
      }
      System.out.println(sum);

      sum = 0;
      int count = 0;
      while (count < intList.size()) { //Traversal with while loop
         sum += intList.get(count);
         count++;
      }
      System.out.println(sum);

      sum = 0;
      for (int i: intList) { //Traversal with enhanced for loop
         sum += i;
      }
      System.out.println(sum);

      for (int i = 0; i < intList.size(); i++) { //Remove 9s with Cha-Cha
         if (intList.get(i) == 9) {
            intList.remove(i);
            i--;
         }
      }
      System.out.println(intList);

      for (int i = intList.size() - 1; i > -1; i--) { //Remove 7s with Moonwalk
         if (intList.get(i) == 7) {
            intList.remove(i);
         }
      }
      System.out.println(intList);

      for (int i = 0; i < intList.size(); i++) { //Remove 0s with Opeyemi's while loop
         while (intList.get(i) == 0) {
            intList.remove(i);
         }
      }
      System.out.println(intList);
   }
}