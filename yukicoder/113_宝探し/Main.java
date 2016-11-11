import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String direction = sc.next();

        int x = 0;
        int y = 0;

        for (int i = 0; i < direction.length(); i++) {

            switch (direction.charAt(i)) {
                case 'N' :
                    y++;
                    break;
                case 'E' :
                    x++;
                    break;
                case 'W' :
                    x--;
                    break;
                case 'S' :
                    y--;
                    break;
            }

        }

        double distance = Math.sqrt((x * x) + (y * y));

        System.out.println(distance);

    }

}
