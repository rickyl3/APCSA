public class Main2
{
    public static void rowMajor(Object[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.println("Row:" + r + " Column:" + c + " " + arr[r][c]);
            }
        }
        System.out.println();
    }
    public static void columnMajor(Object[][] arr) {
        for (int c = 0; c < arr[0].length; c++) {
            for (int r = 0; r < arr.length; r++) {
                System.out.println("Row:" + r + " Column:" + c + " " + arr[r][c]);
            }
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Integer[][] int2D = {{1, 0, 1, 1}, {1, 1, 1, 0}};
        Double[][] double2D = {{1.1, 0.1, 2.1, 3.4}, {2.9, 5.1, 0.7, 3.2}};
        Boolean[][] boolean2D = {{true, true, false}, {false, false, false}};
        String[][] str2D = {{"Never", "gonna", "give", "you", "up"}, {"Never", "gonna", "let", "you", "down"}};
        Piano[][] piano2D = {{new Piano(61), new Piano(0)}, {new Piano(54), new Piano(88)}};
        // rowMajor(int2D);
        // columnMajor(int2D);
        
        // rowMajor(double2D);
        // columnMajor(double2D);

        // rowMajor(boolean2D);
        // columnMajor(boolean2D);

        // rowMajor(str2D);
        // columnMajor(str2D);

        rowMajor(piano2D);
        columnMajor(piano2D);
    }
}