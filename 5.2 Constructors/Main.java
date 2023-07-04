public class Main
{
    public static void main(String[] args)
    {
        LightBulb testBulb = new LightBulb(10);
        System.out.println(testBulb.getBrightness());
        Room testRoom = new Room(testBulb);
        System.out.println("Original lightbulb's brightness: " + testBulb.getBrightness());
        testBulb.setBrightness(13);
        System.out.println("Room's brightness: " + testRoom.getLightBulb().getBrightness());
        System.out.println("New lightbulb's brightness: " + testBulb.getBrightness());
        System.out.println("Room's brightness: " + testRoom.getLightBulb().getBrightness());
    }
}