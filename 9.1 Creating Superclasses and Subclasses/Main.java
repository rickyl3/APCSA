public class Main
{
    public static void main(String[] args)
    {
        iPhone9 p = new iPhone9(0.0, 0.0);
        System.out.println(p.getCondition());
        p.breakPhone();
        System.out.println(p.getCondition());
    }
}