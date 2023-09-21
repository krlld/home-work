package lesson14.task1;

public class Car {
    private final String vin;
    private final int maxSpeed;
    private final int releaseYear;

    public Car(String vin, int maxSpeed, int releaseYear) {
        this.vin = vin;
        this.maxSpeed = maxSpeed;
        this.releaseYear = releaseYear;
    }

    public String getVin() {
        return vin;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getReleaseYear() {
        return releaseYear;
    }
}
