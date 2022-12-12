package transport;

import static transport.ValidateUtils.validateInteger;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final Integer enginePower;

    public Transport(String brand, String model, Integer enginePower) {
        this.brand = validateCarParameters(brand);
        this.model = validateCarParameters(model);
        this.enginePower = validateInteger(enginePower, 2);
    }

    private String validateCarParameters(String model) {
        return model;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Integer getEnginePower() {
        return enginePower;
    }

    abstract void startToMove();

    abstract void finish();

    @Override
    public String toString() {
        return "Transport{" +
                ", brand= " + brand +
                ", model= " + model +
                ", enginePower= " + enginePower;
    }

    public abstract void getPitStopTime();

    public abstract void getMaxSpeed();

    public abstract void getBestLapTime();
}

