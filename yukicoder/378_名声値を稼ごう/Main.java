import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long prestige = sc.nextLong();

        long withSkill = prestige * 2;

        long withoutSkill = 0;

        while (0 < prestige) {
            withoutSkill += prestige;
            prestige /= 2;
        }

        long diff = withSkill - withoutSkill;

        System.out.println(diff);

    }

}
