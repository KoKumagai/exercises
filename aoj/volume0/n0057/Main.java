import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            int num = sc.nextInt();

            System.out.println(num * (num + 1) / 2 + 1);

        }

    }

}