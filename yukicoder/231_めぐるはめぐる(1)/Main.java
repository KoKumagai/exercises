import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dungeon = sc.nextInt();

        int max = 0;

        for (int i = 1; i <= dungeon; i++) {

            int gain = sc.nextInt();
            int death = sc.nextInt();

            int experiencePoint = (gain - 30000 * death) * 6;

            if (30000 * 100 <= experiencePoint) {
                max = i;
            }

        }

        if (max != 0) {

            System.out.println("YES");

            for (int i = 0; i < 6; i++){
                System.out.println(max);
            }

        } else {

            System.out.println("NO");

        }

    }

}
