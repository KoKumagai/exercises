import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long workload = sc.nextInt();
        long deadline = sc.nextInt();

        while (deadline > 1) {

            workload -= workload / (deadline * deadline);
            deadline--;

        }

        System.out.println(workload);

    }

}
