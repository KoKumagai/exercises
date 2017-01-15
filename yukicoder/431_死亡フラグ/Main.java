import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int deadFlag1 = sc.nextInt();
        int deadFlag2 = sc.nextInt();
        int deadFlag3 = sc.nextInt();
        int deadFlagSum = deadFlag1 + deadFlag2 + deadFlag3;

        int survivedFlag = sc.nextInt();

        if (survivedFlag == 1 || deadFlagSum < 2) {
            System.out.println("SURVIVED");
        } else {
            System.out.println("DEAD");
        }

    }

}
