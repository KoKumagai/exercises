import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numWhiteA = sc.nextInt();
        int numBlackA = sc.nextInt();

        int numWhiteB = sc.nextInt();
        int numBlackB = sc.nextInt();

        int numStonesToB = sc.nextInt();
        int numStonesToA = sc.nextInt();

        int numBlackToB = Math.min(numBlackA, numStonesToB);

        numBlackB += numBlackToB;
        numBlackA -= numBlackToB;

        numWhiteB += numStonesToB - numBlackToB;
        numWhiteA -= numStonesToB - numBlackToB;

        int numWhiteToA = Math.min(numWhiteB, numStonesToA);

        numWhiteA += numWhiteToA;
        numWhiteB -= numWhiteToA;

        numBlackA += numStonesToA - numWhiteToA;
        numBlackB -= numStonesToA - numWhiteToA;

        System.out.println(numWhiteA);

    }

}
