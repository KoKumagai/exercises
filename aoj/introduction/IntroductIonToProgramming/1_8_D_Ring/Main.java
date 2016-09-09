import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean isCreatable = false;

        char[] s = sc.next().toCharArray();
        char[] p = sc.next().toCharArray();

        for (int i = 0; i < s.length; i++) {

            if (s[i] == p[0]) {

                for (int j = 0; j < p.length; j++) {

                    int index = i + j;

                    if (index >= s.length) {
                        index -= s.length;
                    }

                    if (s[index] != p[j]) {
                        break;
                    }

                    if (j == p.length - 1) {
                        isCreatable = true;
                    }

                }

            }

        }

        if (isCreatable) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}
