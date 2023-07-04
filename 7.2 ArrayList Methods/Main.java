import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<Integer>(Arrays.asList(3, 2, 8, 4));
        System.out.println(intList);
        System.out.println(intList.size());
        intList.add(1);
        System.out.println(intList);
        intList.add(3, 11);
        System.out.println(intList);
        System.out.println(intList.get(2));
        intList.set(0, 0);
        System.out.println(intList);
        intList.remove(1);
        System.out.println(intList);
    }
}