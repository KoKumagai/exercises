import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] string = sc.next().toCharArray();

        for (int i = 0; i < string.length; i++) {
            string[i] ^= ('a' - 'A');
        }

        System.out.println(String.valueOf(string));

    }

}
