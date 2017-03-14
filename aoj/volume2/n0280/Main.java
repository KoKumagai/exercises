import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            char[] stock = sc.next().toCharArray();
            int[] score = new int[n];
            int discard = 0;

            for (int i = 0; i < stock.length; i++) {

                int player = i % n;

                switch (stock[i]) {

                    case 'M' :
                        score[player]++;
                        break;

                    case 'S' :
                        score[player]++;
                        discard += score[player];
                        score[player] = 0;
                        break;

                    case 'L' :
                        score[player]++;
                        score[player] += discard;
                        discard = 0;
                        break;

                }

            }

            Arrays.sort(score);

            for (int i = 0; i < score.length; i++) {
                System.out.print(score[i] + " ");
            }

            System.out.println(discard);

        }

    }

}
