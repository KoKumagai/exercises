import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] num = new int[3];

        for (int i = 0; i < 3; i++) {
            num[i] = sc.nextInt();
        }

        while (true) {

            Arrays.sort(num);

            if (num[0] + 3 > num[2]) {
                break;
            }

            num[0] += 1;
            num[2] -= 2;

        }

        System.out.println(num[0]);

    }

}
