import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] INPUT_STRING = sc.next().toCharArray();

        int sum = 0;

        for (int i = 0; i < INPUT_STRING.length; i++) {

            if ('0' <= INPUT_STRING[i] && INPUT_STRING[i] <= '9') {
                sum += INPUT_STRING[i] - '0';
            }

        }

        System.out.println(sum);

    }

}
