class Book {
    private String title;
    private int publicationYear;
    public Book(String title, int year) {
        this.title = title; this.publicationYear = year;
    }
    public void displayInfo() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
    }
}

class Author extends Book {
    private String name, bio;
    public Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name; this.bio = bio;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author: " + name + " | Bio: " + bio);
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2024, "James Gosling", "Father of Java");
        a.displayInfo();
    }
}
