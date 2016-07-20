import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int d = sc.nextInt();
            int s = 0;

            for (int i = s; i < 600; i += d) {
                s += i * i * d;
            }

            System.out.println(s);

        }

    }

}
