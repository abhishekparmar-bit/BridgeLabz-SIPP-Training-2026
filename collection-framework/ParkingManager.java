import java.util.*;

public class ParkingManager {
    ArrayList<String> vehicles = new ArrayList<>();

    void enter(String reg) {
        vehicles.add(reg);
    }

    void exit(String reg) {
        vehicles.remove(reg);
    }

    void search(String reg) {
        System.out.println(vehicles.contains(reg) ? "Parked" : "Not Found");
    }

    void display() {
        System.out.println("Vehicles: " + vehicles);
        System.out.println("Total slots: " + vehicles.size());
    }

    public static void main(String[] args) {
        ParkingManager pm = new ParkingManager();
        pm.enter("UP14AB1234");
        pm.enter("DL01XY9999");
        pm.display();
        pm.search("UP14AB1234");
        pm.exit("DL01XY9999");
        pm.display();
    }
}
