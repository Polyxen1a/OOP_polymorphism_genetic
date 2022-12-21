package transport;

public class Bus extends Transport implements Competing {

    private final Integer pitStopTime;
    private final Integer maxSpeed;
    private final Integer bestLapTime;

    private WeightBus weightBus;

    public Bus(String brand,
               String model,
               Integer enginePower, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime, WeightBus weightBus) {
        super(brand, model, enginePower);
        this.pitStopTime = pitStopTime;
        this.maxSpeed = maxSpeed;
        this.bestLapTime = bestLapTime;
        this.weightBus = weightBus;
    }

        public WeightBus weightBus() {
        return weightBus;
    }

        public void setLoadCapacity(WeightBus weightBus) {
        this.weightBus = weightBus;
    }

    @Override
    void startToMove() {
        System.out.println("Автобус стартовал");
    }

    @Override
    void finish() {
        System.out.println("Автобус финишировал");
    }

    @Override
    public void getPitStopTime() {
        System.out.println("pit-stop time is " + pitStopTime);
    }

    @Override
    public void getMaxSpeed() {
        System.out.println("max speed is " + maxSpeed);
    }

    @Override
    public void getPitStop() {

    }

    @Override
    public void getBestLapTime() {
        System.out.println("best lap time is " + bestLapTime);
    }

    @Override
    public void printType() {
        if (weightBus == null) {
            System.out.println("Данных по авто недостаточно");
        } else {
            System.out.println("Вместимость автобуса: от " + weightBus.getFrom() + " чел. до " + weightBus.getTo() + " чел.");
        }

    }

    @Override
    public boolean service() {
        System.out.println("Автобусу " + getBrand() + getModel() + " диагностика не требуется");
        return true;
    }
}

