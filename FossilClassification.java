import java.util.Scanner;


public class FossilClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Fossial Age: ");
        int age = scanner.nextInt();

         if (age >= 202 && age <= 253) {
            System.out.println("This is a fossil from the Triassic period!");
        } else if (age >= 145 && age <= 201) {
            System.out.println("This is a fossil from the Jurassic period!");
        } else if (age >= 66 && age <= 144) {
            System.out.println("This is a fossil from the Cretaceous period!");
        } else {
            System.out.println("._.");
        }
}
}