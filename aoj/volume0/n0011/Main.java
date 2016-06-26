import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int n = sc.nextInt();

        int[] lines = new int[w];

        for (int i = 0; i < w; i++) {
            lines[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {

            String[] s = sc.next().split(",");

            int a = Integer.parseInt(s[0]) - 1;
            int b = Integer.parseInt(s[1]) - 1;

            int temp = lines[a];
            lines[a] = lines[b];
            lines[b] = temp;

        }

        for (int i = 0; i < w; i++) {
            System.out.println(lines[i]);
        }

    }

}
