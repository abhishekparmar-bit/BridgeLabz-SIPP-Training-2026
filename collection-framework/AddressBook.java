import java.util.*;

class Contact {
    String name, phone, email;
    Contact(String n, String p, String e) {
        name = n; phone = p; email = e;
    }
    public String toString() {
        return name + " | " + phone + " | " + email;
    }
}

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList<>();
    HashMap<String, Contact> nameMap = new HashMap<>();
    HashSet<String> phoneSet = new HashSet<>();

    void addContact(String n, String p, String e) {
        if(phoneSet.contains(p)) {
            System.out.println("Duplicate phone not allowed!");
            return;
        }
        Contact c = new Contact(n,p,e);
        contacts.add(c);
        nameMap.put(n,c);
        phoneSet.add(p);
    }

    void searchByName(String n) {
        System.out.println(nameMap.getOrDefault(n,null));
    }

    void deleteByName(String n) {
        Contact c = nameMap.remove(n);
        if(c!=null) {
            contacts.remove(c);
            phoneSet.remove(c.phone);
        }
    }

    void displaySorted() {
        contacts.sort(Comparator.comparing(c -> c.name));
        for(Contact c: contacts) System.out.println(c);
    }

    public static void main(String[] args) {
        AddressBook ab = new AddressBook();
        ab.addContact("Ankit","123","a@x.com");
        ab.addContact("Rahul","456","r@x.com");
        ab.displaySorted();
        ab.searchByName("Ankit");
        ab.deleteByName("Rahul");
        ab.displaySorted();
    }
}
