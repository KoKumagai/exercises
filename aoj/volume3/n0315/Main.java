import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int programmingScore = sc.nextInt();
        int mobileScore = sc.nextInt();
        int cgScore = sc.nextInt();

        int totalScore = programmingScore + mobileScore + cgScore;

        System.out.println(totalScore);

    }

}
