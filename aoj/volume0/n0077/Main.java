import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            char[] input = sc.next().toCharArray();

            for (int i = 0; i < input.length; i++) {

                if (input[i] == '@') {

                    int n = input[i + 1] - '0';

                    for (int j = 0; j < n; j++) {

                        System.out.print(input[i + 2]);

                    }

                    i += 2;

                } else {

                    System.out.print(input[i]);

                }

            }

            System.out.println();

        }

    }

}
