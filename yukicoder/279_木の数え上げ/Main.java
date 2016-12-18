import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] INPUT_STRING = sc.next().toCharArray();

        int[] charCount = new int[123];

        for (int i = 0; i < INPUT_STRING.length; i++) {
            charCount[INPUT_STRING[i]]++;
        }

        int treeMax = Math.min(charCount['t'], Math.min(charCount['r'], (charCount['e'] / 2)));

        System.out.println(treeMax);

    }

}
