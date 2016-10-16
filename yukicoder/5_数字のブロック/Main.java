import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int widthBox = sc.nextInt();
        int numBlock = sc.nextInt();

        int[] widthBlocks = new int[numBlock];

        for (int i = 0; i < numBlock; i++) {
            widthBlocks[i] = sc.nextInt();
        }

        Arrays.sort(widthBlocks);

        int blockCount = 0;
        int widthBlockTotal = 0;

        for (int i = 0; i < numBlock; i++) {

            widthBlockTotal += widthBlocks[i];

            if (widthBlockTotal <= widthBox) {
                blockCount++;
            } else {
                break;
            }

        }

        System.out.println(blockCount);

    }

}
