public class Main
{
    public static void main(String[] args)
    {
        Sheep sheep = new Sheep(9.3, true);
        System.out.println(sheep.getWeight());
        sheep.loseWeight(2.0);
        System.out.println(sheep.getWeight());
    }
}