package collection-framwork;

public import java.util.*;

public class TrafficMonitoringSystem {
    HashMap<String, Integer> trafficData = new HashMap<>();

    // 1. Add or update vehicle count
    void addOrUpdate(String road, int count) {
        trafficData.put(road, trafficData.getOrDefault(road, 0) + count);
    }

    // 2. Display all roads in sorted order
    void displaySorted() {
        TreeMap<String, Integer> sorted = new TreeMap<>(trafficData);
        System.out.println("Traffic Report (Sorted by Road Name):");
        for(String road : sorted.keySet()) {
            System.out.println(road + " -> " + sorted.get(road) + " vehicles");
        }
    }

    // 3. Identify busiest road
    void busiestRoad() {
        String busiest = null;
        int max = 0;
        for(String road : trafficData.keySet()) {
            int count = trafficData.get(road);
            if(count > max) {
                max = count;
                busiest = road;
            }
        }
        System.out.println("Busiest Road: " + busiest + " with " + max + " vehicles");
    }

    // 4. Generate traffic analysis report
    void generateReport() {
        System.out.println("Comprehensive Traffic Report:");
        for(String road : trafficData.keySet()) {
            System.out.println("Road: " + road + " | Vehicles: " + trafficData.get(road));
        }
        busiestRoad();
        System.out.println("Total Roads Monitored: " + trafficData.size());
    }

    public static void main(String[] args) {
        TrafficMonitoringSystem tms = new TrafficMonitoringSystem();

        // Step 1: Add/update data
        tms.addOrUpdate("MG Road", 120);
        tms.addOrUpdate("NH-2", 300);
        tms.addOrUpdate("Ring Road", 180);
        tms.addOrUpdate("NH-2", 50); // update existing road

        // Step 2: Display sorted
        tms.displaySorted();

        // Step 3: Busiest road
        tms.busiestRoad();

        // Step 4: Full report
        tms.generateReport();
    }
}
 {
    
}
