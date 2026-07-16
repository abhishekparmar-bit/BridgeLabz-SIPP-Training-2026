// Interfaces
interface HeartRateMonitor {
    int getHeartRate(String patientId);
    default void displayHealthTips() {
        System.out.println("Tip: Maintain heart rate between 60-100 bpm.");
    }
}

interface TemperatureMonitor {
    double getTemperature(String patientId);
    default void displayHealthTips() {
        System.out.println("Tip: Normal body temperature is ~98.6°F.");
    }

    static boolean isPatientIdValid(String patientId) {
        return patientId.matches("PAT[0-9]{3}"); // Example: PAT101
    }
}

// Implementation
class HealthMonitoringSystem implements HeartRateMonitor, TemperatureMonitor {
    @Override
    public int getHeartRate(String patientId) {
        return (int)(60 + Math.random() * 40); // random 60-100
    }

    @Override
    public double getTemperature(String patientId) {
        return 97.0 + Math.random() * 3; // random 97-100
    }

    // Resolve default method conflict
    @Override
    public void displayHealthTips() {
        HeartRateMonitor.super.displayHealthTips();
        TemperatureMonitor.super.displayHealthTips();
    }

    // Generate report
    public void generateReport(String[] names, String[] ids) {
        for (int i = 0; i < names.length; i++) {
            if (TemperatureMonitor.isPatientIdValid(ids[i])) {
                int hr = getHeartRate(ids[i]);
                double temp = getTemperature(ids[i]);
                System.out.println("Patient: " + names[i] + " | ID: " + ids[i] +
                                   " | Heart Rate: " + hr + " bpm | Temp: " + temp + "°F");
            } else {
                System.out.println("Patient: " + names[i] + " | Invalid ID: " + ids[i]);
            }
        }
    }
}

// Demo
public class HealthDemo {
    public static void main(String[] args) {
        String[] patients = {"Amit", "Neha", "Rahul"};
        String[] ids = {"PAT101", "PAT202", "XYZ999"};

        HealthMonitoringSystem hms = new HealthMonitoringSystem();
        hms.displayHealthTips();
        hms.generateReport(patients, ids);
    }
}
