import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int bathPrice = sc.nextInt();
            int poolPrice = sc.nextInt();
            int numBath = sc.nextInt();
            int numPool = sc.nextInt();

            int regularPrice = (bathPrice * numBath) + (poolPrice * numPool);
            int discountedPrice = (int) ((bathPrice * (Math.max(numBath, 5)) + (poolPrice * Math.max(numPool, 2))) * 0.8);

            System.out.println(Math.min(regularPrice, discountedPrice));

        }

    }

}
