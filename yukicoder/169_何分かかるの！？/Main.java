import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int doneRate = sc.nextInt();
        int taskMinutes = sc.nextInt();

        System.out.println(taskMinutes * 100 / (100 - doneRate));

    }

}
