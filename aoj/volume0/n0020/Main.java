import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] letters = sc.nextLine().toCharArray();

        for (int i = 0; i < letters.length; i++) {

            if (letters[i] >= 'a' && letters[i] <= 'z') {
                letters[i] += 'A' - 'a';
            }

        }

        System.out.println(new String(letters));

    }

}
