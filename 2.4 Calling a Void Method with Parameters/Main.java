public class Main 
    {
        public static void main(String[] args)
        {
            Stool s = new Stool(4, 2.5, "Brown", true);
            System.out.println(s);
            s.addLeg();
            s.addHeight();
            s.setProperties(3, 2.25, "black");
            s.setProperties(2, "purple");
        }
    }