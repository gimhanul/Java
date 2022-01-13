package interfacee.polymorphism.casting;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();

        vehicle.run();
        //vehicle.cehckFare();

        Bus bus = (Bus) vehicle;

        bus.run();
        bus.checkFare();
    }
}
