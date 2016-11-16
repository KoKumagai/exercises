import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] oldVersionString = sc.next().split("\\.");
        String[] targetVersionString = sc.next().split("\\.");

        int[] oldVersion = new int[oldVersionString.length];
        int[] targetVersion = new int[targetVersionString.length];

        for (int i = 0; i < oldVersionString.length; i++) {

            oldVersion[i] = Integer.parseInt(oldVersionString[i]);
            targetVersion[i] = Integer.parseInt(targetVersionString[i]);

        }

        boolean isOld = false;

        if (targetVersion[0] < oldVersion[0]) {
            isOld = true;
        }

        if ((targetVersion[0] == oldVersion[0]) && (targetVersion[1] < oldVersion[1])) {
            isOld = true;
        }

        if ((targetVersion[0] == oldVersion[0]) && (targetVersion[1] == oldVersion[1]) &&
                (targetVersion[2] <= oldVersion[2])) {
            isOld = true;
        }

        System.out.println(isOld ? "YES" : "NO");

    }

}
