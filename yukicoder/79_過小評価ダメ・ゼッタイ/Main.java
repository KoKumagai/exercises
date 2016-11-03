import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numUsers = sc.nextInt();
        int[] levelsCount = new int[6];

        for (int i = 0; i < numUsers; i++) {
            levelsCount[sc.nextInt() - 1]++;
        }

        int max = 0;
        int level = 0;

        for (int i = 0; i < levelsCount.length; i++) {

            if (levelsCount[i] >= max) {

                max = levelsCount[i];
                level = i + 1;

            }

        }

        System.out.println(level);

    }

}
