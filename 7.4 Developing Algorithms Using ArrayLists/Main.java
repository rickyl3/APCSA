import java.util.*;

public class Main
{
   public static boolean doesNotExistInt(ArrayList<Integer> arr, int element) {
      for (int i: arr) {
         if (i == element) {
            return false;
         }
      }
      arr.add(element);
      return true;
   }
   public static boolean doesNotExistDouble(ArrayList<Double> arr, double element) {
      for (double i: arr) {
         if (i == element) {
            return false;
         }
      }
      arr.add(element);
      return true;
   }
   public static boolean doesNotExistBoolean(ArrayList<Boolean> arr, boolean element) {
      for (boolean i: arr) {
         if (i == element) {
            return false;
         }
      }
      arr.add(element);
      return true;
   }
   public static boolean doesNotExistString(ArrayList<String> arr, String element) {
      for (String i: arr) {
         if (i.equals(element)) {
            return false;
         }
      }
      arr.add(element);
      return true;
   }
   public static boolean doesNotExistPoster(ArrayList<Poster> arr, Poster element) {
      for (Poster i: arr) {
         if (i == element) {
            return false;
         }
      }
      arr.add(element);
      return true;
   }

   public static int deleteElementInt(ArrayList<Integer> arr, int element) {
      int deleted = 0;
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) == element) {
            arr.remove(i);
            i--;
            deleted++;
         }
      }
      return deleted;
   }
   public static int deleteElementDouble(ArrayList<Double> arr, double element) {
      int deleted = 0;
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) == element) {
            arr.remove(i);
            i--;
            deleted++;
         }
      }
      return deleted;
   }
   public static int deleteElementBoolean(ArrayList<Boolean> arr, boolean element) {
      int deleted = 0;
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) == element) {
            arr.remove(i);
            i--;
            deleted++;
         }
      }
      return deleted;
   }
   public static int deleteElementString(ArrayList<String> arr, String element) {
      int deleted = 0;
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i).equals(element)) {
            arr.remove(i);
            i--;
            deleted++;
         }
      }
      return deleted;
   }
   public static int deleteElementPoster(ArrayList<Poster> arr, Poster element) {
      int deleted = 0;
      for (int i = 0; i < arr.size(); i++) {
         if (arr.get(i) == element) {
            arr.remove(i);
            i--;
            deleted++;
         }
      }
      return deleted;
   }

   public static ArrayList<Integer> containsAllInt(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
      ArrayList<Integer> result = new ArrayList<Integer>();
      ArrayList<Integer> holder = new ArrayList<Integer>(arr2);
      for (int i: arr) {
         doesNotExistInt(result, i);
      }
      for (int i: arr) {
         deleteElementInt(holder, i);
      } 
      for (int i: holder) {
         doesNotExistInt(result, i);
      }
      return result;
   }
   public static ArrayList<Double> containsAllDouble(ArrayList<Double> arr, ArrayList<Double> arr2) {
      ArrayList<Double> result = new ArrayList<Double>();
      ArrayList<Double> holder = new ArrayList<Double>(arr2);
      for (double i: arr) {
         doesNotExistDouble(result, i);
      }
      for (double i: arr) {
         deleteElementDouble(holder, i);
      }
      for (double i: holder) {
         doesNotExistDouble(result, i);
      }
      return result;
   }
   public static ArrayList<Boolean> containsAllBoolean(ArrayList<Boolean> arr, ArrayList<Boolean> arr2) {
      ArrayList<Boolean> result = new ArrayList<Boolean>();
      ArrayList<Boolean> holder = new ArrayList<Boolean>(arr2);
      for (boolean i: arr) {
         doesNotExistBoolean(result, i);
      }
      for (boolean i: arr) {
         deleteElementBoolean(holder, i);
      }
      for (boolean i: holder) {
         doesNotExistBoolean(result, i);
      }
      return result;
   }
   public static ArrayList<String> containsAllString(ArrayList<String> arr, ArrayList<String> arr2) {
      ArrayList<String> result = new ArrayList<String>();
      ArrayList<String> holder = new ArrayList<String>(arr2);
      for (String i: arr) {
         doesNotExistString(result, i);
      }
      for (String i: arr) {
         deleteElementString(holder, i);
      }
      for (String i: holder) {
         doesNotExistString(result, i);
      }
      return result;
   }
   public static ArrayList<Poster> containsAllPoster(ArrayList<Poster> arr, ArrayList<Poster> arr2) {
      ArrayList<Poster> result = new ArrayList<Poster>();
      ArrayList<Poster> holder = new ArrayList<Poster>(arr2);
      for (Poster i: arr) {
         doesNotExistPoster(result, i);
      }
      for (Poster i: arr) {
         deleteElementPoster(holder, i);
      }
      for (Poster i: holder) {
         doesNotExistPoster(result, i);
      }
      return result;
   }
   public static void main(String[] args)
   {
      ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3));
      ArrayList<Integer> intArr2 = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 1, 5));
      ArrayList<Double> doubleArr = new ArrayList<Double>(Arrays.asList(1.1, 1.2, 1.2, 1.3));
      ArrayList<Double> doubleArr2 = new ArrayList<Double>(Arrays.asList(1.3, 1.2, 1.4, 1.1, 1.5));
      ArrayList<Boolean> boolArr = new ArrayList<Boolean>(Arrays.asList(true, true, true));
      ArrayList<Boolean> boolArr2 = new ArrayList<Boolean>(Arrays.asList(false, true, false));
      ArrayList<String> strArr = new ArrayList<String>(Arrays.asList("hi", "hello", "hello", "hola"));
      ArrayList<String> strArr2 = new ArrayList<String>(Arrays.asList("hola", "hello", "bonjour", "hi", "konnichiwa"));
      ArrayList<Poster> posterArr = new ArrayList<Poster>(Arrays.asList(new Poster("poster1"), new Poster("poster2")));
      posterArr.add(posterArr.get(1));
      posterArr.add(new Poster("poster3"));
      ArrayList<Poster> posterArr2 = new ArrayList<Poster>(Arrays.asList(posterArr.get(3), posterArr.get(2), new Poster("poster4"), posterArr.get(0), new Poster("poster5")));

      System.out.println("-----Method 1-----");
      doesNotExistInt(intArr, 2);
      System.out.println(intArr);
      doesNotExistInt(intArr, 4);
      System.out.println(intArr);

      doesNotExistDouble(doubleArr, 1.2);
      System.out.println(doubleArr);
      doesNotExistDouble(doubleArr, 1.4);
      System.out.println(doubleArr);

      doesNotExistBoolean(boolArr, true);
      System.out.println(boolArr);
      doesNotExistBoolean(boolArr, false);
      System.out.println(boolArr);

      doesNotExistString(strArr, "hello");
      System.out.println(strArr);
      doesNotExistString(strArr, "bonjour");
      System.out.println(strArr);

      doesNotExistPoster(posterArr, posterArr.get(0));
      System.out.println(posterArr);
      doesNotExistPoster(posterArr, posterArr.get(2));
      System.out.println(posterArr);
      System.out.println();

      System.out.println("-----Method 2-----");
      System.out.println(deleteElementInt(intArr, 2));
      System.out.println(intArr);
      System.out.println(deleteElementDouble(doubleArr, 1.2));
      System.out.println(doubleArr);
      System.out.println(deleteElementBoolean(boolArr, true));
      System.out.println(boolArr);
      System.out.println(deleteElementString(strArr, "hello"));
      System.out.println(strArr);
      System.out.println(deleteElementPoster(posterArr, posterArr.get(1)));
      System.out.println(posterArr);
      System.out.println();

      intArr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3));
      intArr2 = new ArrayList<Integer>(Arrays.asList(3, 2, 4, 1, 5, 5));
      doubleArr = new ArrayList<Double>(Arrays.asList(1.1, 1.2, 1.2, 1.3));
      doubleArr2 = new ArrayList<Double>(Arrays.asList(1.3, 1.2, 1.4, 1.1, 1.5, 1.5));
      boolArr = new ArrayList<Boolean>(Arrays.asList(true, true, true));
      boolArr2 = new ArrayList<Boolean>(Arrays.asList(false, true, false));
      strArr = new ArrayList<String>(Arrays.asList("hi", "hello", "hello", "hola"));
      strArr2 = new ArrayList<String>(Arrays.asList("hola", "hello", "bonjour", "hi", "konnichiwa", "bonjour"));
      posterArr = new ArrayList<Poster>(Arrays.asList(new Poster("poster1"), new Poster("poster2")));
      posterArr.add(posterArr.get(1));
      posterArr.add(new Poster("poster3"));
      posterArr2 = new ArrayList<Poster>(Arrays.asList(posterArr.get(3), posterArr.get(2), new Poster("poster4"), posterArr.get(0), new Poster("poster5")));
      System.out.println("-----Method 3-----(different lists than the altered ones from testing previous methods)");
      System.out.println(containsAllInt(intArr, intArr2));
      System.out.println(containsAllDouble(doubleArr, doubleArr2));
      System.out.println(containsAllBoolean(boolArr, boolArr2));
      System.out.println(containsAllString(strArr, strArr2));
      System.out.println(containsAllPoster(posterArr, posterArr2));
   }
}