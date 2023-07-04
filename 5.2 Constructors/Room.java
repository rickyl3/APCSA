public class Room
{
    private LightBulb lightBulb;

    public Room(LightBulb l) {
        lightBulb = new LightBulb(l.getBrightness());
    }
    public Room() {
    }

    public LightBulb getLightBulb() {
        return lightBulb;
    }
}