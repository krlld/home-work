package lesson14.task1;

import java.util.Arrays;

// Task about cars and parking
public class Main {
    public static void main(String[] args) {
        Parking parking = new Parking(Arrays.asList(
                new Car("123", 150, 2018),
                new Car("456", 160, 2015),
                new Car("789", 180, 2011))
        );
        try {
            parking.checkCar("456");
            parking.checkCar("156");
        } catch (VinNotFoundException exception) {
            exception.printStackTrace();
        }
        System.out.println(parking.countByYear(8));
    }
}
