public class Main
{
    public static void main(String[] args)
    {
        int[] temp = {34, 50, 36, 41, 26};
        double[] empty = new double[5];
        boolean[] isSnowing = {false, false, false, false, true};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        System.out.println(temp[3]);
        temp[3] = 44;
        System.out.println(temp[3]);

        Day[] weekdays = new Day[5];
        for (int i = 0; i < 5; i++) {
            weekdays[i] = new Day(days[i], temp[i], isSnowing[i]);
        }

        try {
            Day randomDay = new Day(days[5], temp[3], isSnowing[2]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There is an ArrayIndexOfBoundsException.");
        }

        for (Day weekdayTemp: weekdays) {
            System.out.print(weekdayTemp.getTemp() + " ");
        }
    }
}