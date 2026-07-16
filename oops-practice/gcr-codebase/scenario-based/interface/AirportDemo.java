
// Interfaces
interface LuggageScanner {
    boolean scanLuggage(String passengerName);
    default void displaySecurityGuidelines() {
        System.out.println("Guidelines: No sharp objects, liquids >100ml restricted.");
    }
}

interface PassportVerifier {
    boolean verifyPassport(String passportNo);
    default void displaySecurityGuidelines() {
        System.out.println("Guidelines: Passport must be valid and not expired.");
    }

    static boolean isPassportNumberValid(String passportNo) {
        return passportNo.matches("[A-Z]{2}[0-9]{6}"); // Example: AB123456
    }
}

// Implementation
class AirportSecuritySystem implements LuggageScanner, PassportVerifier {
    @Override
    public boolean scanLuggage(String passengerName) {
        return !passengerName.toLowerCase().contains("knife"); // simple rule
    }

    @Override
    public boolean verifyPassport(String passportNo) {
        return PassportVerifier.isPassportNumberValid(passportNo);
    }

    // Resolve default method conflict
    @Override
    public void displaySecurityGuidelines() {
        LuggageScanner.super.displaySecurityGuidelines();
        PassportVerifier.super.displaySecurityGuidelines();
    }
}

// Demo
public class AirportDemo {
    public static void main(String[] args) {
        String[] passengers = {"Ravi", "Ankit", "Priya"};
        String[] passports = {"AB123456", "XY987654", "INVALID"};

        AirportSecuritySystem system = new AirportSecuritySystem();
        system.displaySecurityGuidelines();

        for (int i = 0; i < passengers.length; i++) {
            boolean luggageOk = system.scanLuggage(passengers[i]);
            boolean passportOk = system.verifyPassport(passports[i]);

            if (luggageOk && passportOk) {
                System.out.println(passengers[i] + " can board flight.");
            } else {
                System.out.println(passengers[i] + " cannot board flight.");
            }
        }
    }
}
