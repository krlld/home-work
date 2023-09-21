package lesson14.task1;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Parking {
    private final List<Car> cars;

    public Parking(List<Car> cars) {
        this.cars = cars;
    }

    public void checkCar(String vin) throws VinNotFoundException {
        for (Car car : cars) {
            if (car.getVin().equals(vin)) {
                return;
            }
        }
        throw new VinNotFoundException("Car with vin " + vin + " not found");
    }

    public int countByYear(int year) {
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        System.out.println(currentYear);
        int count = 0;
        for (Car car : cars) {
            if (car.getReleaseYear() + year >= currentYear) {
                count++;
            }
        }
        return count;
    }
}
