import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBamboo = sc.nextInt();

        int[] bamboos = new int[numBamboo];

        int kadomatsuCount = 0;

        for (int i = 0; i < numBamboo; i++) {
            bamboos[i] = sc.nextInt();
        }

        int first = bamboos[0];
        int middle = bamboos[1];

        for (int i = 2; i < numBamboo; i++) {

            int last = bamboos[i];

            if (((first < middle && last < middle) || (middle < first && middle < last))
                    && first != last) {
                kadomatsuCount++;
            }

            first = middle;
            middle = last;

        }

        System.out.println(kadomatsuCount);

    }

}
