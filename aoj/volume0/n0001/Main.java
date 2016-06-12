import java.util.Scanner;

public class Main {

    public static void main(String[] a) {

        int[] input = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            input[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            int max = 0;
            int max_index = 0;

            for (int j = 0; j < input.length; j++) {

                if (input[j] > max) {
                    max = input[j];
                    max_index = j;
                }

            }

            System.out.println(max);
            input[max_index] = 0;
        }

    }

}
