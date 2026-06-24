interface Refuelable {
    void refuel();
}

class Vehicle {
    private int maxSpeed;
    private String model;
    public Vehicle(int speed, String model) { this.maxSpeed = speed; this.model = model; }
    public void showDetails() { System.out.println("Model: " + model + ", MaxSpeed: " + maxSpeed); }
}

class ElectricVehicle extends Vehicle {
    public ElectricVehicle(int speed, String model) { super(speed, model); }
    public void charge() { System.out.println("Charging EV..."); }
}

class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(int speed, String model) { super(speed, model); }
    public void refuel() { System.out.println("Refueling Petrol Vehicle..."); }
}

public class VehicleDemo {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle(150, "Tesla Model 3");
        PetrolVehicle pv = new PetrolVehicle(180, "Honda City");
        ev.showDetails(); ev.charge();
        pv.showDetails(); pv.refuel();
    }
}
