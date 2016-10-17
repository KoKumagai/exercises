import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        for (int i = 0; i < s.length(); i++) {

            int charIndex = (s.charAt(i) - 'A' - (i + 1)) % 26;
            char character = (char) (((charIndex + 26) % 26) + 'A');
            System.out.print(character);

        }

    }

}
