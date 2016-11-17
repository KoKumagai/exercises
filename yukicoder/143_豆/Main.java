import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numBeansPerPack = sc.nextInt();
        int numPacks = sc.nextInt();
        int numPeople = sc.nextInt();

        int numLeftovers = numBeansPerPack * numPacks;

        for (int i = 0; i < numPeople; i++) {

            int age = sc.nextInt();
            numLeftovers -= age;

        }

        if (numLeftovers < 0) {
            numLeftovers = -1;
        }

        System.out.println(numLeftovers);

    }

}
