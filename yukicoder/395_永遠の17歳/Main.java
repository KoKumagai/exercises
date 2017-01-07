import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int AGE = sc.nextInt();

        if (15 <= AGE) {
            System.out.println(AGE - 7);
        } else {
            System.out.println(-1);
        }

    }

}
