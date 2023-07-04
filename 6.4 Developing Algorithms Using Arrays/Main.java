import java.util.*;

public class Main
{
    public static int maxInt(int[] arr) {
        int max = arr[0];
        for (int element: arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static String longestStr(String[] arr) {
        String maxLengthElement = arr[0];
        int maxLengthIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxLengthElement.length()) {
                maxLengthElement = arr[i];
                maxLengthIndex = i;
            }
        }
        return arr[maxLengthIndex];
    }

    public static int longestStrLength(String[] arr) {
        int maxLengthElement = arr[0].length();
        for (String element: arr) {
            if (element.length() > maxLengthElement) {
                maxLengthElement = element.length();
            }
        } 
        return maxLengthElement;
    }

    public static double maxDouble(double[] arr) {
        double max = arr[0];
        for (double element: arr) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static int minInt(int[] arr) {
        int min = arr[0];
        for (int element: arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static String shortestStr(String[] arr) {
        int shortLength = arr[0].length();
        int shortIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < shortLength) {
                shortIndex = i;
                shortLength = arr[i].length();
            }
        }
        return arr[shortIndex];
    }

    public static int shortestStrLength(String[] arr) {
        int shortLength = arr[0].length();
        for (String element: arr) {
            if (element.length() < shortLength) {
                shortLength = element.length();
            }
        }
        return shortLength;
    }

    public static double minDouble(double[] arr) {
        double min = arr[0];
        for (double element: arr) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    public static int sumInt(int[] arr) {
        int sum = 0;
        for (int element: arr) {
            sum += element;
        }
        return sum;
    }

    public static double sumDouble(double[] arr) {
        double sum = 0;
        for (double element: arr) {
            sum += element;
        }
        return sum;
    }

    public static double intAverage(int[] arr) {
        return (double) sumInt(arr) / arr.length;
    }

    public static double doubleAverage(double[] arr) {
        return sumDouble(arr) / arr.length;
    }

    public static String booleanProportion(boolean[] arr) {
        int trueCount = 0;
        int falseCount = 0;
        for (boolean element: arr) {
            if (element == true) {
                trueCount++;
            }
            else {
                falseCount++;
            }
        }
        return trueCount + "/" + falseCount;
    }

    public static int modeInt(int[] arr) {
        int mode = arr[0];
        int modeCount = 0;
        for (int element: arr) {
            if (element == mode) {
                modeCount++;
            }
        }
        for (int element: arr) {
            if (element != mode) {
                int check = element;
                int checkCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == check) {
                        checkCount++;
                    }
                }
                if (checkCount > modeCount) {
                    mode = check;
                    modeCount = checkCount;
                }
            }
        }
        return mode;
    }

    public static String modeString(String[] arr) { // Most common String
        String mode = arr[0];
        int modeCount = 0;
        for (String element: arr) {
            if (element.equals(mode)) {
                modeCount++;
            }
        }
        for (String element: arr) {
            if (element != mode) {
                String check = element;
                int checkCount = 0;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equals(check)) {
                        checkCount++;
                    }
                }
                if (checkCount > modeCount) {
                    mode = check;
                    modeCount = checkCount;
                }
            }
        }
        return mode;
    }

    public static int numEvenNumbers(int[] arr) {
        int count = 0;
        for (int element: arr) {
            if (element % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static boolean intContainsDup(int[] arr) {
        for (int element: arr) {
            int count = 0;
            for (int element2: arr) {
                if (element == element2) {
                    count++;
                }
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean strContainsDup(String[] arr) {
        for (String element: arr) {
            int count = 0;
            for (String element2: arr) {
                if (element.equals(element2)) {
                    count++;
                }
                if (count > 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean intAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (!(arr[i] <= arr[i+1])) {
                return false;
            }
        }
        return true;
    }

    public static boolean strAlphabetical(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].compareTo(arr[i+1]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static String[] shiftRight(String[] arr) {
        String[] result = new String[arr.length];
        result[0] = arr[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }

    public static String[] shiftLeft(String[] arr) {
        String[] result = new String[arr.length];
        result[result.length - 1] = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            result[i] = arr[i + 1];
        }
        return result;
    }

    public static String[] reverseOrder(String[] arr) {
        String[] result = new String[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i > -1; i--) {
            result[index] = arr[i];
            index++;
        }
        return result;
    }

    public static int[] intSortAscending(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int x = i + 1; x < arr.length; x++) {
                int temp = 0;
                if (arr[i] > arr[x]) {
                    temp = arr[i];
                    arr[i] = arr[x];
                    arr[x] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args)
    {
        int[] intArr = {9, 7, 4, 11, 12, 2, 6, 6, 2, 2, 7};
        int[] intArr2 = {1, 2, 3, 4, 5};
        double[] doubleArr = {3.1415, 6.33124, 9.9942394, 4.405464, 8.4321};
        String[] strArr = {"Hello", "Hola", "Computer", "Window", "Bug", "Bird", "Yes", "x"};
        String[] strArr2 = {"Hi", "Hi", "Hola", "Bonjour", "Bonjour", "Bonjour", "Hola", "Konnichiwa", "Konnichiwa", "Konnichiwar", "Bonjour"};
        String[] strArr3 = {"a", "b", "c"};
        boolean[] boolArr = {true, false, true, true, true, false, false, true};
        System.out.println("maxInt: " + maxInt(intArr));
        System.out.println("longestStr: " + longestStr(strArr));
        System.out.println("longestStrLength: " + longestStrLength(strArr));
        System.out.println("maxDouble: " + maxDouble(doubleArr));
        System.out.println("minInt: " + minInt(intArr));
        System.out.println("shortestStr: " + shortestStr(strArr));
        System.out.println("shortestStrLength: " + shortestStrLength(strArr));
        System.out.println("minDouble: " + minDouble(doubleArr));
        System.out.println("sumInt: " + sumInt(intArr));
        System.out.println("sumDouble: " + sumDouble(doubleArr));
        System.out.println("intAverage: " + intAverage(intArr));
        System.out.println("doubleAverage: " + doubleAverage(doubleArr));
        System.out.println("booleanProportion: " + booleanProportion(boolArr));
        System.out.println("modeInt: " + modeInt(intArr));
        System.out.println("Most Common String: " + modeString(strArr2)); // Most common String
        System.out.println("numEvenNumbers: " + numEvenNumbers(intArr));
        System.out.println("int Contains Duplicates: " + intContainsDup(intArr2));
        System.out.println("int Contains Duplicates 2: " + intContainsDup(intArr));
        System.out.println("str Contains Duplicates: " + strContainsDup(strArr2));
        System.out.println("str Contains Duplicates 2: " + strContainsDup(strArr));
        System.out.println("int Ascending Order: " + intAscending(intArr2));
        System.out.println("int Ascending Order 2: " + intAscending(intArr));
        System.out.println("str Alphabetical Order: " + strAlphabetical(strArr));
        System.out.println("str Alphabetical Order: " + strAlphabetical(strArr3));
        System.out.println("Shifted right: " + Arrays.toString(shiftRight(strArr)));
        System.out.println("Shifted left: " + Arrays.toString(shiftLeft(strArr)));
        System.out.println("Reverse Order: " + Arrays.toString(reverseOrder(strArr)));
        System.out.println("Int Ascending: " + Arrays.toString(intSortAscending(intArr)));
    }
}