import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] str = sc.next().toCharArray();
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            String command = sc.next();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (command) {

                case "print" :

                    for (int j = a; j <= b; j++) {
                        System.out.print(str[j]);
                    }
                    System.out.println();
                    break;

                case "reverse" :

                    for (int j = 0; j < (b - a + 1) / 2; j++) {

                        char tmp = str[a + j];
                        str[a + j] = str[b - j];
                        str[b - j] = tmp;

                    }
                    break;

                case "replace" :

                    char[] p = sc.next().toCharArray();
                    for (int j = a; j <= b; j++) {
                        str[j] = p[j - a];
                    }
                    break;

            }

        }

    }

}
