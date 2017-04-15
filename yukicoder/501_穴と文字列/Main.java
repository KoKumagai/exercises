import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numCharacters = sc.nextInt();
        int numHoles = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        while (numHoles > numCharacters) {

            sb.append('B');
            numHoles -= 2;
            numCharacters--;

        }

        while (numHoles != 0) {

            sb.insert(0, 'A');
            numHoles--;
            numCharacters--;

        }

        while (numCharacters != 0) {

            sb.append('C');
            numCharacters--;

        }

        System.out.println(sb.toString());

    }

}
