import java.util.*;

public class AgeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i+1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Step 2: Sort ages
        Arrays.sort(ages);

        // Step 3: Display sorted ages
        System.out.println("Sorted ages: " + Arrays.toString(ages));
    }
}
