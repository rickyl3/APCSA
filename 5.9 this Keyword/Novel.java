public class Novel
{
    private String title;
    private int pages;
    private double length;
    private double width;
    private double height;

    public Novel(String title, int pages, double length, double width, double height) {
        this.title = title;
        this.pages = pages;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public double area() {
        return length * width;
    }
    public void volume() {
        System.out.println(Volume.volume(this));
    }
    public double getHeight() {
        return height;
    }
}
