public class School
{
    private String name;
    private int students;
    private int floors;
    private double height; //ft
    private boolean isOpen;

    public School(String name, int students, int floors, double height, boolean isOpen) {
        this.name = name;
        this.students = students;
        this.floors = floors;
        this.height = height;
        this.isOpen = isOpen;
    }
    public School(String name, int students, int floors, double height) {
        this.name = name;
        this.students = students;
        this.floors = floors;
        this.height = height;
    }

    public String toString() {
        return "The school, " + name + ", has at least " + randomStudent() + " students, " + floors + " floors, and is " + height + " tall.";
    }
    private int randomStudent() {
        return ((int) (Math.random() * students) + 1);
    }

    public String getName() {
        return name;
    }
    public int getStudents() {
        return students;
    }
    public int getFloors() {
        return floors;
    }
    public double getHeight() {
        return height;
    }
    public boolean getIsOpen() {
        return isOpen;
    }

    public void changeName(String n) {
        name = n;
    }
    public void addStudents(int n) {
        students += n;
    }
    public void addFloor(int n) {
        floors += n;
    }
    public void addHeight(int f) {
        height += f;
    }
    public void flipIsOpen() {
        if (isOpen) {
            isOpen = false;
        }
        else {
            isOpen = true;
        }
    }
}