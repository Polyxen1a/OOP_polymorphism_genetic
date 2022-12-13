package transport;

public enum LoadCapacityTruck {
    N1(3.5, 12),
    N2(13, 20),
    N3(21, 500);

    private double min;
    private double max;

    LoadCapacityTruck(double min, double max) {
        this.min = min;
        this.max = max;
    }
    LoadCapacityTruck() {
    }

    public double getMin() {
        return min;
    }

    public double getMax() {
        return max;
    }

    public static LoadCapacityTruck getValue(double value) {
        for (LoadCapacityTruck e : LoadCapacityTruck.values()) {
            if (value >= e.getMin() && value <= e.getMax()) {
                System.out.println(e);
                return e;
            }
        }
        return null;
    }
}
