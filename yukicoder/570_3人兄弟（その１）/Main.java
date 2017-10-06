import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ha = sc.nextInt();
        int hb = sc.nextInt();
        int hc = sc.nextInt();

        if (ha > hb && hb > hc) {
            System.out.println('A');
            System.out.println('B');
            System.out.println('C');
        } else if (ha > hc && hc > hb) {
            System.out.println('A');
            System.out.println('C');
            System.out.println('B');
        } else if (hb > ha && ha > hc) {
            System.out.println('B');
            System.out.println('A');
            System.out.println('C');
        } else if (hb > hc && hc > ha) {
            System.out.println('B');
            System.out.println('C');
            System.out.println('A');
        } else if (hc > ha && ha > hb) {
            System.out.println('C');
            System.out.println('A');
            System.out.println('B');
        } else if (hc > hb && hb > ha) {
            System.out.println('C');
            System.out.println('B');
            System.out.println('A');
        }

    }

}
