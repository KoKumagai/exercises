import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numAnimals = sc.nextInt();
        int legs[] = new int[numAnimals];

        int legsSum = 0;

        for (int i = 0; i < numAnimals; i++) {
            legs[i] = sc.nextInt();
            legsSum += legs[i];
        }

        legsSum /= numAnimals - 1;

        int cranesCount = 0;
        int turtlesCount = 0;

        for (int i = 0; i < numAnimals; i++) {

            if (legsSum - legs[i] == 2) {
                cranesCount++;
            }

            if (legsSum - legs[i] == 4) {
                turtlesCount++;
            }

        }

        System.out.println(cranesCount + " " + turtlesCount);

    }

}
