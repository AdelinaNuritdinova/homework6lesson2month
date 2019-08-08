package adelina;

public class Car implements Comparable<Car>{
    private String model;
    private int year;
    private int volume;


    public Car(String model, int year, int volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }

    @Override
    public int compareTo(Car car) {
        if(this.year < car.getYear()){
            return -1;
        }else if (this.year > car.getYear()){
            return 1;
        }else {
            return 0;
        }

    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getVolume() {
        return volume;
    }
}
