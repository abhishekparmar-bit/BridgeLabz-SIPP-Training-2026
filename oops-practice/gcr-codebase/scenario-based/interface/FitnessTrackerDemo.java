// Interfaces
interface Trackable {
    void logActivity(String activity);
    default void resetData() {
        System.out.println("Data reset to default.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert(String message);
}

// Class implementing all three
class FitnessDevice implements Trackable, Reportable, Notifiable {
    @Override
    public void logActivity(String activity) {
        System.out.println("Activity logged: " + activity);
    }

    @Override
    public void generateReport() {
        System.out.println("Report generated: Steps, Calories, Heart Rate.");
    }

    @Override
    public void sendAlert(String message) {
        System.out.println("Alert: " + message);
    }
}

// Demo
public class FitnessTrackerDemo {
    public static void main(String[] args) {
        FitnessDevice fd = new FitnessDevice();
        fd.logActivity("Running 5 km");
        fd.generateReport();
        fd.sendAlert("Hydrate yourself!");
        fd.resetData(); // default method from Trackable
    }
}
