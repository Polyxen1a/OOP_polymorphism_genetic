package transport;

    public class Truck extends Transport implements Competing {

        private final Integer pitStopTime;
        private final Integer maxSpeed;
        private final Integer bestLapTime;

        public Truck(String brand,
                     String model,
                     Integer enginePower,
                     Integer pitStopTime,
                     Integer maxSpeed,
                     Integer bestLapTime) {
            super(brand, model, enginePower);
            this.pitStopTime = pitStopTime;
            this.maxSpeed = maxSpeed;
            this.bestLapTime = bestLapTime;
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

    }

