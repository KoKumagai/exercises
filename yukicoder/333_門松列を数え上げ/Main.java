import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int middle = sc.nextInt();

        if (left < middle) {
            System.out.println(middle - 2);
        } else if (middle < left) {
            System.out.println(2000000000 - middle - 1);
        }

    }

}
