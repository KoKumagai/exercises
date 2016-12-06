import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double requiredExp = sc.nextInt();
        double normalUP = sc.nextInt();
        double campaignUP = sc.nextInt();

        double normal = Math.ceil(requiredExp / normalUP);
        double campaign = Math.ceil(requiredExp / campaignUP);

        if (campaign <= (normal * 2 / 3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
