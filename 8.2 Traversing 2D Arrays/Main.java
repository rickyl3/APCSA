import java.util.*;

public class Main
{
    public static int numString(String[][] arr, String check) {
        int count = 0;
        for (String[] singleArr: arr) {
            for (String str: singleArr) {
                if (str.indexOf(check) >= 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean containInt(int[][] arr, int check) {
        for (int[] singleArr: arr) {
            for (int num: singleArr) {
                if (num == check) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int[] index(int[][] arr, int check) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r][c] == check) {
                    return new int[]{r, c};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] diagonal(int[][] arr) {
        int[] result = new int[Math.min(arr.length, arr[0].length)];
        for (int i = 0; i < result.length; i++) {
            result[i] = arr[i][i];
        }
        return result;
    }

    public static String concatenateStr(String[][] arr, int index) {
        String result = arr[0][index];
        for (int i = 1; i < arr.length; i++) {
            result += " " + arr[i][index];
        }
        return result;
    }
    public static void main(String[] args)
    {
        String[][] strArr = {{"Hello", "world", "!"}, {"It's", "me", "Genevieve"}};
        int[][] intArr = {{1, 2}, {3, 4}};
        System.out.println(numString(strArr, "e"));
        System.out.println(containInt(intArr, 5));
        System.out.println(Arrays.toString(index(intArr, 3)));
        int[][] diagonalTest = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        System.out.println(Arrays.toString(diagonal(diagonalTest)));
        System.out.println(concatenateStr(strArr, 1));
    }
}