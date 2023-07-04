/**
 * HandSanitizer.java
 * @author Ricky Leung
 * @since December 13, 2021
 * This class creates a hand sanitizer.
 */
public class HandSanitizer
{
    private String brandName;
    private int alcoholPercentage; // 0 to 100
    private double volume; /* milliliters */

    /**
     * Constructor that takes the brand name, alcohol percentage, and volume for a hand sanitizer
     * Preconditions: parameter alcoholPercentage is within 0 and 100, inclusive
     *      parameter volume is greater than 0
     * Postconditions: a hand sanitizer with a brandName, alcoholPercentage, and volume is created
     * @param brandName the brand name of the hand sanitizer
     * @param alcoholPercentage the alcohol percentage of the hand sanitizer
     * @param volume the volume of the hand sanitizer in milliliters
     */
    public HandSanitizer(String brandName, int alcoholPercentage, double volume)  {
        this.brandName = brandName;
        this.alcoholPercentage = alcoholPercentage;
        this.volume = volume;
    }

    /**
     * Constructor that takes the alcohol percentage and volume for a hand sanitizer
     * Preconditions: parameter alcoholPercentage is within 0 and 100, inclusive
     *      parameter volume is greater than 0
     * Postconditions: a hand sanitizer with a alcoholPercentage, and volume is created
     * @param alcoholPercentage the alcohol percentage of the hand sanitizer
     * @param volume the volume of the hand sanitizer in milliliters
     */
    public HandSanitizer(int alcoholPercentage, double volume) {
        this.alcoholPercentage = alcoholPercentage;
        this.volume = volume;
    }

    /**
     * Method that takes a new volume for the hand sanitizer
     * Preconditions: parameter volume is greater than 0
     * Postconditions: attribute volume of the constructed hand sanitizer is changed
     * @param volume  the volume of the hand sanitizer in milliliters
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    /**
     * Method that gets the brandName attribute of the constructed hand sanitizer
     * Preconditions: constructed hand sanitizer has the attribute, brandName
     * Postcondiitons: attribute brandName is returned
     * @return attribute brandName
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Method that gets the alcoholPercentage attribute of the constructed hand sanitizer
     * Postconditions: attribute alcoholPercentage is returned
     * @return attribute alcoholPercentage
     */
    public int getAlcoholPercentage() {
        return alcoholPercentage;
    }

    /**
     * Method that gets the volume attribute of the constructed hand sanitizer
     * Postconditions: attribute volume is returned
     * @return attribute volume
     */
    public double getVolume() {
        return volume;
    }
}