import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int oneYenCoins = sc.nextInt();
        int fiveYenCoins = sc.nextInt();

        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; i <= oneYenCoins; i++) {

            for (int j = 0; j <= fiveYenCoins; j++) {

                set.add(j * 5 + i);

            }

        }

        set.remove(0);

        for (int s : set) {
            System.out.println(s);
        }

    }

}
