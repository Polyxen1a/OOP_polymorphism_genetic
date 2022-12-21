import jdk.jfr.Category;
import transport.*;
import transport.DriverB;


public class Main {
    public static void main(String[] args) {
        Car kia = new Car("Kia", "Stringer", 3,3, 1, 1, BodyType.SEDAN);

        Truck kamazTruck1 = new Truck("Камаз", "5490", 12, 5, 60, 8, LoadCapacityTruck.N3);

        Bus kamazBus1 = new Bus("Камаз", "5299", 40 - 57, 7, 5, 70, WeightBus.MEDIUM);

        service(
                kia, kamazTruck1, kamazBus1);

    }

    private static void service(Car kia, Truck kamazTruck1, Bus kamazBus1) {
    }

    private static void servise(Transport... transports) {
        for (Transport transport : transports) {
            serviceTransport(transport);
        }
    }

    private static void serviceTransport(Transport transport) {
        try {
            if (!transport.service()) {
                throw new RuntimeException("Автомобиль " + transport.getBrand() + " " + transport.getModel() + " не прошёл диагностику");
            }
        } catch (RuntimeException e) {
                System.out.println(e.getMessage());
            }
        }
}