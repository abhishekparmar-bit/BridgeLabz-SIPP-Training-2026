class Device {
    private String deviceId;
    private String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId + ", Status: " + status);
    }
}

class Thermostat extends Device {
    private int temperatureSetting;

    public Thermostat(String deviceId, String status, int temp) {
        super(deviceId, status);
        this.temperatureSetting = temp;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

public class SmartHomeDemo {
    public static void main(String[] args) {
        Thermostat t = new Thermostat("D101", "ON", 24);
        t.displayStatus();
    }
}
