import java.util.*;

public class Main
{
   public static int intZero(ArrayList<Integer> arr) {
      int count = 0;
      for (int i: arr) {
         if (i < 0) {
            count++;
         }
      }
      return count;
   }
   public static int doubleZero(ArrayList<Double> arr) {
      int count = 0;
      for (double i: arr) {
         if (i < 0) {
            count++;
         }
      }
      return count;
   }
   public static int boolEqual(ArrayList<Boolean> arr, boolean input) {
      int count = 0;
      for (boolean i: arr) {
         if (i == input) {
            count++;
         }
      }
      return count;
   }
   public static boolean strFound(ArrayList<String> arr, String input) {
      for (String i: arr) {
         if (i.equals(input)) {
            return true;
         }
      }
      return false;
   }
   public static boolean appearBoth(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
      int count = 0;
      if (arr.size() > arr2.size()) {
         for (int i: arr2) {
            for (int a: arr) {
               if (i != a && count == arr.size()) {
                  return false;
               }
               count++;
            }
         }
         return true;
      }
      else {
         for (int i: arr) {
            for (int a: arr2) {
               if (i != a && count == arr.size()) {
                  return false;
               }
               count++;
            }
         }
      }
      return true;
   }
   public static void main(String[] args)
   {
      ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(-1, 0, 1));
      ArrayList<Double> doubleArr = new ArrayList<Double>(Arrays.asList(1.1, 0.1, -1.1));
      ArrayList<Boolean> boolArr = new ArrayList<Boolean>(Arrays.asList(false, false, true));
      ArrayList<String> strArr = new ArrayList<String>(Arrays.asList("String"));
      ArrayList<Integer> intArr2 = new ArrayList<Integer>(Arrays.asList(1));
      System.out.println(intZero(intArr));

      System.out.println(doubleZero(doubleArr));

      System.out.println(boolEqual(boolArr, false));

      System.out.println(strFound(strArr, "string"));
      strArr.add("string");
      System.out.println(strFound(strArr, "string"));

      // intArr = [-1, 0, 1]   intArr2 = [1];
      System.out.println(appearBoth(intArr, intArr2));
      intArr2.add(2);
      System.out.println(appearBoth(intArr, intArr2));
      ArrayList<Integer> ex = new ArrayList<Integer>(Arrays.asList(1, 2));
      ArrayList<Integer> ex2 = new ArrayList<Integer>(Arrays.asList(2));
      System.out.println(appearBoth(ex, ex2));
   }
}