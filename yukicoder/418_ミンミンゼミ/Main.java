import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String minminString = sc.next();

        int minminCount = 0;

        for (int i = 0; i < minminString.length(); i++) {

            if (minminString.charAt(i) == 'n') {
                minminCount++;
            }

        }

        System.out.println(minminCount);

    }

}
