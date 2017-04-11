import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int decimal = sc.nextInt();
        long septenary = 0;
        long place = 1;

        while (decimal > 0) {

            septenary += (decimal % 7) * place;
            decimal /= 7;
            place *= 10;

        }

        System.out.println(septenary);

    }

}
