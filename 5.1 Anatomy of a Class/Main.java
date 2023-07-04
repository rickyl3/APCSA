public class Main
{
    public static void main(String[] args)
    {
        School rock = new School("Rock", 3200, 3, 150, true);
        System.out.println(rock.getName());
        System.out.println(rock.getStudents());
        rock.addStudents(100);
        System.out.println(rock.getStudents());
        System.out.println(rock.toString());
    }
}