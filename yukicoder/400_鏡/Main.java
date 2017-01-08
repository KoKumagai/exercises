import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String brackets = sc.next();

        StringBuffer sb = new StringBuffer();

        for (int i = brackets.length() - 1; 0 <= i; i--) {

            char bracket = brackets.charAt(i);

            if (bracket == '<') {
                sb.append('>');
            } else if (bracket == '>') {
                sb.append('<');
            }

        }

        System.out.println(sb.toString());

    }

}
