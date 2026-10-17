import java.util.Scanner;
public class Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade as a percentage (example 92):");
        if (!scanner.hasNextInt()){ System.out.println("Invalid grade input, please enter a valid integer percentage");  }
        int grade = scanner.nextInt();
        System.out.println("Enter the weight of final exam as a decimal (example 0.20):");
         if (!scanner.hasNextDouble()){ System.out.println("Invalid weight input, please enter a valid decimal");  }
        double weight = scanner.nextDouble();
        System.out.println("Enter the grade you want(A,B,C,D):");
        String desiredGrade = scanner.next();

     
        int desiredGradeValue = 0;
        switch (desiredGrade) {

            case "A":
                desiredGradeValue = 90;
                break;
            case "B":
                desiredGradeValue = 80;
                break;
            case "C":
                desiredGradeValue = 70;
                break;
            case "D":
                desiredGradeValue = 60;
                break;
            default:
                desiredGradeValue = 90;
                System.out.println("Invalid grade input , defaulting to A");
         

        }

       double neededScore = (desiredGradeValue - (grade * (1 - weight)))/weight;
System.out.println("you need a need a percentage score of " + neededScore + " on the final exam to get a " + desiredGrade);
    }
}

