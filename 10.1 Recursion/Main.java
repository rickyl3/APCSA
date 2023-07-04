import java.util.*;

public class Main 
{
    public static void main(String[] args)
    {
        printLetters("Recursion sucks");
        System.out.println();
        printLettersIterative("Recursion sucks");

        System.out.println();
        String[] arr = {"sucks", "Recursion"};
        String[] arr2 = {"is", "so", "useless", "and", "complicated"};
        System.out.println();
        printLetters(arr, 1);
        printLetters(arr2, 0);
        System.out.println();
        printLettersIterative(arr, 1);
        printLettersIterative(arr2, 0);

        System.out.println();
        System.out.println();
        ArrayList<String> arrList = new ArrayList<String>(Arrays.asList("yo", "yo1", "yo2", "why", "is", "this", "a", "unit"));
        printLetters(arrList, 2);
        System.out.println();
        printLettersIterative(arrList, 2);
    }

    public static void printLetters(String str) {
        if (str.length() > 0) {
            System.out.print(str.substring(0, 1) + " ");
            printLetters(str.substring(1));
        }
    }
    public static void printLetters(String[] arr, int i) {
        if (i < arr.length) {
            printLetters(arr[i]);
            System.out.print(" ");
            printLetters(arr, i+1);
        }
    }
    public static void printLetters(ArrayList<String> arrList, int i) {
        if (i < arrList.size()) {
            System.out.print(arrList.get(i) + " ");
            printLetters(arrList, i+1);
        }
    }

    public static void printLettersIterative(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.substring(i, i+1) + " ");
        }
    }
    public static void printLettersIterative(String[] arr, int a) {
        for (int i = a; i < arr.length; i++) {
            printLettersIterative(arr[i]);
            System.out.print(" ");
        }
    }
    public static void printLettersIterative(ArrayList<String> arrList, int a) {
        for (int i = a; i < arrList.size(); i++) {
            System.out.print(arrList.get(i) + " ");
        }
    }
}
