public class Binder
{
   private int looseleafAmount;
   private double height;
   private boolean isOpen;
   private String brand;
   
public Binder(int l, double h, boolean i, String b)
   {
      looseleafAmount = l;
      height = h;
      isOpen = i;
      brand = b;
   }
public Binder(int l, double h)
   {
      looseleafAmount = l;
      height = h;
   }
public void addlooseleaf()
   {
      looseleafAmount++;
      System.out.println("This binder has " + looseleafAmount + " pages.");
   }
public void cutheight()
   {
      height = height - 0.1;
      System.out.println("This binder is " + height + " feet tall.");
   }
}