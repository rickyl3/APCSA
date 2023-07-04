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
}