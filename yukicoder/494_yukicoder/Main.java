import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final String YUKICODER = "yukicoder";

        String note = sc.next();
        int questionIndex = note.indexOf('?');

        System.out.println(YUKICODER.charAt(questionIndex));

    }

}
