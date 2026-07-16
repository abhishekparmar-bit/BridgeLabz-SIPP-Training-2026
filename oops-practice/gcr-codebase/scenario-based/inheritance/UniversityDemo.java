class Person {
    private String name;
    public Person(String name) { this.name = name; }
    public String toString() { return "Person: " + name; }
}

class Student extends Person {
    private final String studentId;   // final
    private double gpa;
    public Student(String name, String studentId, double gpa) {
        super(name);
        this.studentId = studentId;
        this.gpa = gpa;
    }
    public String toString() {
        return super.toString() + ", StudentID: " + studentId + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;
    public GradStudent(String name, String studentId, double gpa, String thesis) {
        super(name, studentId, gpa);
        this.thesis = thesis;
    }
    public String toString() {
        return super.toString() + ", Thesis: " + thesis;
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        GradStudent gs = new GradStudent("Ankit", "S123", 8.7, "AI Research");
        System.out.println(gs); // GradStudent IS-A Student IS-A Person
    }
}
