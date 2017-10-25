import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] sides = new int[4];

        for (int i = 0; i < 4; i++) {
            sides[i] = sc.nextInt();
        }

        Arrays.sort(sides);

        if (sides[0] == sides[1] && sides[2] == sides[3]) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }

}
