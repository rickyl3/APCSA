public class whileLoops 
{
    public static boolean divisibleBySecond (int first, int second) {
        return first % second == 0;
    }
 
    public static int intCharAt (int integer, int index) {
        String integerStr = Integer.toString(integer);
        String digitStr = integerStr.substring(index, index += 1);
        return Integer.parseInt(digitStr);
    }
 
    public static int frequency (int integer, int number) {
        int digit;
        int count = 0;
        while (integer > 0) {
            digit = integer % 10;
            if (digit == number) {
                count++;
            }
            integer /= 10;
        }
        return count;
    }
 
    public static int maximumDigit (int integer) {
        int digit;
        int maximum = 0;
        while (integer > 0) {
            digit = integer % 10;
            if (digit > maximum) {
                maximum = digit;
            }
            integer /= 10;
        }
        return maximum;
    }
 
    public static int minimumDigit (int integer) {
        int digit;
        int minimum = 9;
        while (integer > 0) {
            digit = integer % 10;
            if (digit < minimum) {
                minimum = digit;
            }
            integer /= 10;
        }
        return minimum;
    }
 
    public static int sum (int integer) {
        int digit;
        int sum = 0;
        while (integer > 0) {
            digit = integer % 10;
            sum = sum + digit;
            integer /= 10;
        }
        return sum;
    }
 
    public static int average (int integer) {
        int average;
        int digit;
        int count = 0;
        int sum = 0;
        while (integer > 0) {
            digit = integer % 10;
            sum = sum + digit;
            integer /= 10;
            count++;
        }
        average = sum / count;
        return average;
    }
 
    public static int mode (int integer) {
        int modeNum = 0;
        int modeNumFrequency = 0;
        int i = 0;
        while (i < 10) {
            int frequency = frequency(integer, i);
            if (modeNumFrequency < frequency) {
                modeNum = i;
                modeNumFrequency = frequency;
            }
            i++;
        }
        return modeNum;
    }
}

