import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int trueAnswer = 0;

        for (int i = 0; i < N; i++) {
            trueAnswer += sc.nextInt();
        }

        int yukiAnswer = sc.nextInt();

        int diff = trueAnswer - yukiAnswer;

        System.out.println(diff);

    }

}
