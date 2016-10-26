import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numWantBiscuits = sc.nextInt();

        int numCurrentBiscuits = 1;
        int hitPocketCount = 0;

        while (numCurrentBiscuits < numWantBiscuits) {

            numCurrentBiscuits *= 2;
            hitPocketCount++;

        }

        System.out.println(hitPocketCount);

    }

}
