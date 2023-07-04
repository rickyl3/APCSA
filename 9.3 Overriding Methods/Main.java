public class Main
{
    public static void main(String[] args)
    {
        Sheep sheep = new Sheep();
        Animal animal = new Animal();
        sheep.print();
        animal.print();
        sheep.onlySuper();
        animal.onlySuper();
    }
}