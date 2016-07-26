import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numberOfBloodTypes = new int[4];

        while (sc.hasNext()) {

            String str[] = sc.next().split(",");

            if (str[1].equals("A")) {
                numberOfBloodTypes[0]++;
            }

            if (str[1].equals("B")) {
                numberOfBloodTypes[1]++;
            }

            if (str[1].equals("AB")) {
                numberOfBloodTypes[2]++;
            }

            if (str[1].equals("O")) {
                numberOfBloodTypes[3]++;
            }

        }

        for (int i = 0; i < numberOfBloodTypes.length; i++) {
            System.out.println(numberOfBloodTypes[i]);
        }

    }

}
