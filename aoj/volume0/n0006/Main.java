import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder reversedString = new StringBuilder();

        for (int i = str.length() - 1; i >= 0 ; i--) {

            reversedString.append(str.charAt(i));

        }

        System.out.println(reversedString);

    }

}
