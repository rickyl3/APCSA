import java.util.*;

public class Main
{
   public static String[] selectionAlph(String[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
         int minIndex = i;
         for (int a = i + 1; a < arr.length; a++) {
            if (arr[a].compareTo(arr[minIndex]) < 0) {
               minIndex = a;
            }
         }
         if (i != minIndex) {
            String temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
         }
      }
      return arr;
   }

   public static String[] insertionAlph(String[] arr) {
      for (int i = 1; i < arr.length; i++) {
         String key = arr[i];
         int a = i - 1;
         while (a >= 0 && arr[a].compareTo(key) > 0) {
            arr[a + 1] = arr[a];
            a--;
         }
         arr[a + 1] = key;
      }
      return arr;
   }

   public static ArrayList<String> selectionAlphList(ArrayList<String> arr) {
      for (int i = 0; i < arr.size() - 1; i++) {
         int minIndex = i;
         for (int a = i + 1; a < arr.size(); a++) {
            if (arr.get(a).compareTo(arr.get(minIndex)) < 0) {
               minIndex = a;
            }
         }
         if (i != minIndex) {
            String temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
         }
      }
      return arr;
   }

   public static ArrayList<String> insertionAlphList(ArrayList<String> arr) {
      for (int i = 1; i < arr.size(); i++) {
         String key = arr.get(i);
         int a = i - 1;
         while (a >= 0 && arr.get(a).compareTo(key) > 0) {
            arr.set(a + 1, arr.get(a));
            a--;
         }
         arr.set(a + 1, key);
      }
      return arr;
   }

   public static ArrayList<Integer> selectionAscend(ArrayList<Integer> arr) {
      for (int i = 0; i < arr.size() - 1; i++) {
         int minIndex = i;
         for (int a = i + 1; a < arr.size(); a++) {
            if (arr.get(a) < arr.get(minIndex)) {
               minIndex = a;
            }
         }
         if (i != minIndex) {
            int temp = arr.get(minIndex);
            arr.set(minIndex, arr.get(i));
            arr.set(i, temp);
         }
      }
      return arr;
   }

   public static ArrayList<Integer> insertionAscend(ArrayList<Integer> arr) {
      for (int i = 1; i < arr.size(); i++) {
         int key = arr.get(i);
         int a = i - 1;
         while (a >= 0 && arr.get(a) > key) {
            arr.set(a + 1, arr.get(a));
            a--;
         }
         arr.set(a + 1, key);
      }
      return arr;
   }
   public static void main(String[] args)
   {
      String[] strings = {"zebra", "alpha", "beta", "apcsa", "apcsa"};
      String[] strings2 = {"zebra", "alpha", "beta", "apcsa", "apcsa"};
      System.out.println(Arrays.toString(selectionAlph(strings)));
      System.out.println(Arrays.toString(insertionAlph(strings2)));

      ArrayList<String> stringsList = new ArrayList<String>(Arrays.asList("zebra", "alpha", "beta", "apcsa", "apcsa"));
      System.out.println(selectionAlphList(stringsList));
      stringsList = new ArrayList<String>(Arrays.asList("zebra", "alpha", "beta", "apcsa", "apcsa"));
      System.out.println(insertionAlphList(stringsList));

      ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(-1, 0, 4, 1, 1));
      System.out.println(selectionAscend(intList));
      intList = new ArrayList<Integer>(Arrays.asList(-1, 0, 4, 1, 1));
      System.out.println(insertionAscend(intList));
   }
}