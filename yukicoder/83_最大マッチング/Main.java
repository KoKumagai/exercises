import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numMatchsticks = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (0 < numMatchsticks ) {

            if (numMatchsticks % 2 == 1) {

                sb.append('7');
                numMatchsticks -= 3;

            } else {

                sb.append('1');
                numMatchsticks -= 2;

            }

        }

        System.out.println(sb.toString());

    }

}
