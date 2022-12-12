package transport;

    public class Car extends Transport implements Competing {

        private Integer pitStopTime;
        private Integer maxSpeed;
        private Integer bestLapTime;

        public Car(String brand, String model, Integer enginePower, Integer pitStopTime, Integer maxSpeed, Integer bestLapTime) {
            super((brand), model, enginePower);
            this.pitStopTime = pitStopTime;
            this.maxSpeed = maxSpeed;
            this.bestLapTime = bestLapTime;
        }

        @Override
        void startToMove() {
            System.out.println("Машина стартовала");
        }
        @Override
        void finish() {
            System.out.println("Машина финишировала");
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
