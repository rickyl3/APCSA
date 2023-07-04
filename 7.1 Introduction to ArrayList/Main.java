import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        System.out.println(intList);

        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(Math.PI);
        doubleList.add(Integer.MIN_VALUE - 0.1);
        doubleList.add(Integer.MAX_VALUE + 0.1);
        System.out.println(doubleList);

        ArrayList<Boolean> boolList = new ArrayList<Boolean>();
        for (int i = 0; i < 10; i++) {
            boolList.add(i % 2 == 0);
        }
        System.out.println(boolList);

        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Hello");
        strList.add("World!");
        System.out.println(strList);

        ArrayList<Plushies> plushList = new ArrayList<Plushies>();
        plushList.add(new Plushies());
        plushList.add(new Plushies());
        plushList.add(new Plushies());
        System.out.println(plushList);
    }
}