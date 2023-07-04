public class Methods
{
    public static boolean waterReq(String item) {
        return item.indexOf("water") != -1 || item.indexOf("bottle") != -1;
    }
    public static boolean cansReq(String item) {
        return item.indexOf("can") != -1 || item.indexOf("food") != -1;
    }
    public static boolean aidReq(String item) {
        return item.indexOf("first") != -1 || item.indexOf("aid") != -1 || item.indexOf("kit") != -1;
    }
    public static boolean gamesReq(String item) {
        return item.indexOf("game") != -1;
    }

    public static void printStats(int a) {
        double progress = a / 10.0;
        double missingProgress = (int) (10 - progress);
        while (progress > 0) {
            System.out.print("█");
            progress--;
        }
        while (missingProgress > 0) {
            System.out.print("░");
            missingProgress--;
        }
        System.out.println("═╣ " + a + "%");
    }
}
