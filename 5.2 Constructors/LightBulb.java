public class LightBulb
{
    private int brightness;

    public LightBulb(int brightness) {
        this.brightness = brightness;
    }
    public LightBulb() {
    }

    public void setBrightness(int b) {
        brightness = b;
    }
    public int getBrightness() {
        return brightness;
    }
}