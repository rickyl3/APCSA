public class Main
{
   public static void main(String[] arg)
   {
      Binder b = new Binder(60, 1.5, true, "composition");
      System.out.println(b);
      b.addlooseleaf();
      b.cutheight();
   }
}