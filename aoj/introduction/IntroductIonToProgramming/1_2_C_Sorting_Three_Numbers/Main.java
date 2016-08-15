import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] abc = {sc.nextInt(), sc.nextInt(), sc.nextInt()};

        for (int i = 0; i < abc.length; i++) {

            for (int j = 1; j < abc.length - i; j++) {

                if (abc[j - 1] > abc[j]) {

                    int temp = abc[j - 1];
                    abc[j - 1] = abc[j];
                    abc[j] = temp;

                }

            }

        }

        System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);

    }

}
