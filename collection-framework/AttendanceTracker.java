import java.util.*;

public class AttendanceTracker {
    HashMap<String, ArrayList<String>> subjectMap = new HashMap<>();

    void markAttendance(String subject, String student) {
        subjectMap.putIfAbsent(subject, new ArrayList<>());
        ArrayList<String> list = subjectMap.get(subject);
        if(!list.contains(student)) list.add(student);
        else System.out.println("Duplicate attendance not allowed!");
    }

    void display() {
        for(String sub: subjectMap.keySet()) {
            ArrayList<String> list = subjectMap.get(sub);
            System.out.println(sub + " -> " + list + " | Total: " + list.size());
        }
    }

    public static void main(String[] args) {
        AttendanceTracker at = new AttendanceTracker();
        at.markAttendance("Math","Ankit");
        at.markAttendance("Math","Rahul");
        at.markAttendance("Math","Ankit"); // duplicate
        at.markAttendance("Science","Neha");
        at.display();
    }
}
