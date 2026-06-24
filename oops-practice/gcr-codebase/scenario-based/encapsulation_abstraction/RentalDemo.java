abstract class Vehicle {
    private String vehicleNumber, vehicleType;
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String n) { vehicleNumber = n; }
    public String getVehicleType() { return vehicleType; }
    public void setVehicleType(String t) { vehicleType = t; }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle {
    private double dailyRate;
    public void setDailyRate(double r) { dailyRate = r; }
    double calculateRentalCost(int days) { return days * dailyRate; }
}

class Bike extends Vehicle {
    private double dailyRate;
    public void setDailyRate(double r) { dailyRate = r; }
    double calculateRentalCost(int days) { return days * dailyRate; }
}

class Truck extends Vehicle {
    private double dailyRate, loadingCharge;
    public void setDailyRate(double r) { dailyRate = r; }
    public void setLoadingCharge(double c) { loadingCharge = c; }
    double calculateRentalCost(int days) { return (days * dailyRate) + loadingCharge; }
}

public class RentalDemo {
    public static void main(String[] args) {
        Car c = new Car(); c.setVehicleNumber("C101"); c.setVehicleType("Car"); c.setDailyRate(1000);
        Bike b = new Bike(); b.setVehicleNumber("B202"); b.setVehicleType("Bike"); b.setDailyRate(300);
        Truck t = new Truck(); t.setVehicleNumber("T303"); t.setVehicleType("Truck"); t.setDailyRate(2000); t.setLoadingCharge(5000);

        System.out.println(c.getVehicleType()+" Cost: "+c.calculateRentalCost(5));
        System.out.println(b.getVehicleType()+" Cost: "+b.calculateRentalCost(5));
        System.out.println(t.getVehicleType()+" Cost: "+t.calculateRentalCost(5));
    }
}
