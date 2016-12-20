import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] stageName = sc.next().toCharArray();

        int masterA = sc.nextInt();
        int masterB = sc.nextInt();

        for (int i = 0; i < stageName.length; i++) {

            if ((i != masterA) && (i != masterB)) {
                System.out.print(stageName[i]);
            }

        }

    }

}
