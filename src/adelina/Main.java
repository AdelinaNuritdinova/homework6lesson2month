package adelina;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("1" , 2000 , 2000));
        cars.add(new Car("2" , 2006 , 2001));
        cars.add(new Car("3" , 2002 , 2002));
        cars.add(new Car("4" , 2003 , 2003));
        cars.add(new Car("5" , 2004 , 2004));
        cars.add(new Car("6" , 2005 , 2005));
        cars.add(new Car("7" , 2002 , 2006));
        cars.add(new Car("8" , 2009 , 2007));
        cars.add(new Car("9" , 2008 , 2008));
        cars.add(new Car("10" , 2007 , 2009));

        Collections.sort(cars);

        for (Car car: cars) {
            System.out.println(car.getModel() + " модель машины " + car.getYear() + " год выпуска машины ");
            
        }

    }
}
