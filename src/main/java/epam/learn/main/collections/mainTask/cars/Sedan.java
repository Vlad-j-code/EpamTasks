package epam.learn.main.collections.mainTask.cars;

public class Sedan extends Car {
    public Sedan(int price, int fuelConsumption, int speed) {
        super(price, fuelConsumption, speed);
    }

    @Override
    public String toString() {
        return "Седан" + super.toString();
    }
}
