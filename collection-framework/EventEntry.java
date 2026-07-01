import java.util.*;

public class EventEntry {
    HashSet<String> participants = new HashSet<>();

    void register(String email) {
        if(!participants.add(email))
            System.out.println("Duplicate entry rejected!");
    }

    void display() {
        System.out.println("Participants: " + participants);
        System.out.println("Total: " + participants.size());
    }

    public static void main(String[] args) {
        EventEntry ee = new EventEntry();
        ee.register("ankit@mail.com");
        ee.register("rahul@mail.com");
        ee.register("ankit@mail.com"); // duplicate
        ee.display();
    }
}
