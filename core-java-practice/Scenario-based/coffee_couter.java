import java.util.Scanner;

public class coffee_couter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or 'exit': ");
            String coffee = sc.nextLine();

            if (coffee.equalsIgnoreCase("exit")) {
                System.out.println("Thank you");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double price = 0;

            switch (coffee.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;

                case "latte":
                    price = 150;
                    break;

                case "cappuccino":
                    price = 180;
                    break;

                default:
                    System.out.println("Invalid coffee type!");
                    continue;
            }

            double bill = price * quantity;
            double gst = bill * 0.18;
            double totalBill = bill + gst;
            System.out.println("Coffee Type : " + coffee);
            System.out.println("Quantity    : " + quantity);
            System.out.println("Bill Amount : " + bill);
            System.out.println("GST (18%)   : " + gst);
            System.out.println("Total Bill  : " + totalBill);
            
        }
    }
}