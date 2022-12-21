package transport;

public class DriverD<T extends Bus> extends Driver {
    public DriverD(String name, Boolean hasLicense, Integer experience) throws IllegalAccessException {
        super(name, hasLicense, experience);
    }

    @Override
    public String start() {
        return "Bus has started";
    }
    @Override
    public String stop() {
        return "Bus has stopped";
    }
    @Override
    public String refuel() {
        return "Bus is charging with petrol";
    }
    public String getCarMessage(Bus bus) {
        return "Driver " + getName() + " is driving bus " + bus.getBrand() + " " + bus.getModel() + " will participate in race";
    }
}