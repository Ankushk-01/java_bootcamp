
import java.util.Scanner;

public class GradleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your test score : ");
        int score = sc.nextInt();
        if((score >= 90) && (score <=100 )) {
            System.out.println("Gradle : "+"A");
        }
        else if ((score >= 80) && (score <=89 )) {
            System.out.println("Gradle : "+"B");
        }
        else if ((score >= 70) && (score <=79 )) {
            System.out.println("Gradle : "+"C");
        }
        else if ((score >= 60) && (score <=69 )) {
            System.out.println("Gradle : "+"D");
        }
        else if ((score >= 50) && (score <=59 )) {
            System.out.println("Gradle : "+"E");
        }
        else if ((score<50) && (score>=0)) {
            System.out.println("Gradle : "+"F");
        }
        else{
            System.out.println("Please enter the valid score...");
        }
    }
}
