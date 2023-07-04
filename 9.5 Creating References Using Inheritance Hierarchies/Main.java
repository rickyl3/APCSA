import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        IceCream idk = new IceCream("Brown Sugar", 80, 60);
        Food item = new IceCream("Vanilla", 121, 50);
        Food cereal = new Food(25);
        item.consume(70);
        System.out.println(item.hasMoreThan(cereal));
        System.out.println(item.hasMoreThan(idk));
        Food[] foodArr = {cereal, new Food(0), new Food(10), idk, new IceCream("Strawberry", 1)};
        ArrayList<Food> foodArrList = new ArrayList<Food>(Arrays.asList(cereal, new Food(10), new Food(0), idk, new IceCream("random flavor", 1111)));
    }
}