public class AlgorithmsUsingStrings
{
    public static int frequency(String searchIn, String searchFor) {
        int frequency = 0;
        for (int i = 0; i <= searchIn.length() - searchFor.length(); i++) {
            String subStr = searchIn.substring(i, i + searchFor.length());
            if (subStr.equals(searchFor)) {
                frequency++;
            }
        }
        return frequency;
    }
 
    public static String reverseOrder(String string) {
        String reverseOrder = "";
        for (int i = string.length(); i > 0; i--) {
            reverseOrder += string.substring(i - 1, i);
        }
        return reverseOrder;
    }
 
    // Challenge 1 (not case sensitive)
    public static boolean isPalindrome(String string) {
        return reverseOrder(string).equals(string);
    }
 
    public static void main(String[] args)
    {
        System.out.println(frequency("olollolollolloo", "ol"));
        System.out.println(reverseOrder("dsaAdal43ASDAdsa"));
        System.out.println(isPalindrome("racecar"));
    }
} 
