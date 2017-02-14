import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        int[] wordsCount = new int[words.length];

        int letterMax = 0;
        int letterMaxIdx = 0;

        for (int i = 0; i < words.length; i++) {

            if (letterMax < words[i].length()) {
                letterMax = words[i].length();
                letterMaxIdx = i;
            }

            for (int j = i; j < words.length; j++) {

                if (words[i].equals(words[j])) {
                    wordsCount[j]++;
                }

            }

        }

        int wordMax = 0;

        for (int i = 0; i < wordsCount.length; i++) {

            if (wordMax < wordsCount[i]) {
                wordMax = i;
            }

        }

        System.out.println(words[wordMax] + " " + words[letterMaxIdx]);

    }

}
