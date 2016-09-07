import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            String num = sc.nextLine();

            if (num.charAt(0) - '0' == 0) {
                break;
            }

            int sum = 0;
            for (int i = 0; i < num.length(); i++) {
                sum += num.charAt(i) - '0';
            }

            System.out.println(sum);

        }

    }

}
