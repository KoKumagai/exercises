import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            System.out.println(1);
            return;
        }

        String route = sc.next();

        int road = 1;

        for (int i = 0; i < route.length(); i++) {

            road *= 2;

            if (route.charAt(i) == 'R') {
                road++;
            }

        }

        System.out.println(road);

    }

}
