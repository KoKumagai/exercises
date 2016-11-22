import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double headProbability = sc.nextDouble();
        double canPlugProbability = sc.nextDouble();

        if ((1 - headProbability) * canPlugProbability < headProbability * (1 - canPlugProbability) * canPlugProbability) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
