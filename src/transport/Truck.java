package transport;

    public class Truck extends Transport implements Competing {

        private final Integer pitStopTime;
        private final Integer maxSpeed;
        private final Integer bestLapTime;

        private LoadCapacityTruck loadCapacityTruck;

        public Truck(String brand,
                     String model,
                     Integer enginePower,
                     Integer pitStopTime,
                     Integer maxSpeed,
                     Integer bestLapTime,
                     LoadCapacityTruck loadCapacityTruck) {
            super(brand, model, enginePower);
            this.pitStopTime = pitStopTime;
            this.maxSpeed = maxSpeed;
            this.bestLapTime = bestLapTime;
            this.loadCapacityTruck = loadCapacityTruck;
        }

        public LoadCapacityTruck loadCapacityTruck() {
            return loadCapacityTruck();
        }

        public void setLoadCapacityTruck(LoadCapacityTruck loadCapacityTruck) {
            this.loadCapacityTruck = loadCapacityTruck;
        }

        @Override
        void startToMove() {
            System.out.println("Грузовик стартовал");
        }

        @Override
        void finish() {
            System.out.println("Грузовик финишировал");
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
            if (loadCapacityTruck == null) {
                System.out.println("Данных по авто недостаточно");
            } else {
                System.out.println("Грузоподъемность авто: " + loadCapacityTruck + " т.");
            }
        }
    }

