import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean[][] cards = new boolean[4][14];

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            char suit = sc.next().charAt(0);
            int rank = sc.nextInt();

            switch (suit) {
                case 'S':
                    cards[0][rank] = true;
                    break;
                case 'H':
                    cards[1][rank] = true;
                    break;
                case 'C':
                    cards[2][rank] = true;
                    break;
                case 'D':
                    cards[3][rank] = true;
                    break;
            }

        }

        for (int i = 0; i < cards.length; i++) {

            for (int j = 1; j < cards[i].length; j++) {

                if (cards[i][j] == false) {

                    switch (i) {
                        case 0:
                            System.out.println("S " + j);
                            break;
                        case 1:
                            System.out.println("H " + j);
                            break;
                        case 2:
                            System.out.println("C " + j);
                            break;
                        case 3:
                            System.out.println("D " + j);
                            break;
                    }

                }

            }

        }

    }

}
