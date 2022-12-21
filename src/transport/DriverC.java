package transport;

public class DriverC<T extends Truck> extends Driver {
    public DriverC(String name, Boolean hasLicense, Integer experience) throws IllegalAccessException {
        super(name, hasLicense, experience);
    }

    @Override
    public String start() {
        return "Truck has started";
    }
    @Override
    public String stop() {
        return "Truck has stopped";
    }
    @Override
    public String refuel() {
        return "Truck is charging with petrol";
    }
    public String getCarMessage(Truck truck) {
        return "Driver " + getName() + " is driving truck " + truck.getBrand() + " " + truck.getModel() + " will participate in race";
    }
}