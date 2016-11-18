import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MOD = 1000000007;

        int numDeskTypes = sc.nextInt();

        long numPeopleSitMax = 0;

        for (int i = 0; i < numDeskTypes; i++) {

            long numChairs = sc.nextLong();
            long numDesk = sc.nextLong();

            long numPeopleCanSit = (numChairs + 1) / 2;

            numPeopleCanSit %= MOD;
            numDesk %= MOD;

            numPeopleSitMax = (numPeopleCanSit * numDesk + numPeopleSitMax) % MOD;

        }

        System.out.println(numPeopleSitMax);

    }

}
