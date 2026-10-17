import java.util.Scanner;
public class PolygonIdentification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of sides of the polygon:");
        int sides = scanner.nextInt();

       switch (sides) {
            case 3:
                System.out.println("The polygon is a triangle.");
                break;
            case 4:
                System.out.println("The polygon is a quadrilateral.");
                break;
            case 5:
                System.out.println("The polygon is a pentagon.");
                break;
            case 6:
                System.out.println("The polygon is a hexagon.");
                break;
            default:
                System.out.println("figure it out yourself >:(");
        }
    }
}