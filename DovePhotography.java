import java.util.Scanner;
public class DovePhotography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the `family:");
        String family = scanner.nextLine();
        System.out.println("enter the Feather color:");
        String featherColor = scanner.nextLine();
        System.out.println("enter the Eye color:");
        String eyeColor = scanner.nextLine();
       
if (family.equals("columbidae")){
    System.out.println("Dove take pictures");
    if (featherColor.equals("orange") && eyeColor.equals("blue")){
   System.out.println("Cooler dove!! Take many pictures!!");
            }
        } else {
            System.out.println("Meh bird... let's find a different one.");
        }
    }
}
