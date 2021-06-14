package epam.learn.main.collections.mainTask.cars;

public class Cabriolet extends Car {
    public Cabriolet(int price, int fuelConsumption, int speed) {
        super(price, fuelConsumption, speed);
    }

    @Override
    public String toString() {
        return "Кабриолет" + super.toString();
    }
}
