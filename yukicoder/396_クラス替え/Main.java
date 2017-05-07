import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();
        int groups = sc.nextInt();
        int hanakoRank = sc.nextInt();
        int taroRank = sc.nextInt();

        if ((hanakoRank - taroRank) % (2 * groups) == 0) {
            System.out.println("YES");
            return;
        }

        if ((hanakoRank + taroRank) % (2 * groups) == 1) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

    }

}
