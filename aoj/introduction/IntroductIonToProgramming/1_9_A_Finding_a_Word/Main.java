import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String W = sc.next();
        int numberOfWords = 0;

        while (true) {

            String T = sc.next();

            if (T.equals("END_OF_TEXT")) {
                break;
            }

            String[] words = T.split(" ");

            for (int i = 0; i < words.length; i++) {

                if (words[i].equalsIgnoreCase(W)) {
                    numberOfWords++;
                }

            }

        }

        System.out.println(numberOfWords);

    }

}
