interface Worker {
    void performDuties();
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void showInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

class Chef extends Person implements Worker {
    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Chef is cooking delicious meals.");
    }
}

class Waiter extends Person implements Worker {
    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers.");
    }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Chef chef = new Chef("Rahul", 101);
        Waiter waiter = new Waiter("Amit", 102);

        chef.showInfo();
        chef.performDuties();

        waiter.showInfo();
        waiter.performDuties();
    }
}
