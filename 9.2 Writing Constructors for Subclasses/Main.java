public class Main
{
    public static void main(String[] args)
    {
        iPhone9 p = new iPhone9(0.0, 0.0);
        System.out.println(p.getCondition());
        p.breakPhone();
        System.out.println(p.getCondition());
        System.out.println(p.length());
        iPhone9 a = new iPhone9();
        System.out.println(a.length());
    }
}