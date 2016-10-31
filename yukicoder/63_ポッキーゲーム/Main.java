import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pockyLength = sc.nextInt();
        int perCrunchLength = sc.nextInt();

        int numCrunch = (int) (Math.ceil(pockyLength / (2.0 * perCrunchLength)) - 1);
        int eatPockyLenght = numCrunch * perCrunchLength;

        System.out.println(eatPockyLenght);

    }

}
