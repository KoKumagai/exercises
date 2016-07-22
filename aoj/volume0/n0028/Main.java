import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numberOfIntegers[] = new int[101];

        while (sc.hasNext()) {
            numberOfIntegers[sc.nextInt()]++;
        }

        int modeValue = 0;
        for (int i = 1; i <= 100; i++) {

            if (numberOfIntegers[i] > modeValue) {
                modeValue = numberOfIntegers[i];
            }

        }

        for (int i = 0; i <= 100; i++) {

            if (modeValue == numberOfIntegers[i]) {
                System.out.println(i);
            }

        }

    }

}
