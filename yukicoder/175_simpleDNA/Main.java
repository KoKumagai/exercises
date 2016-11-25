import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dnaSequenceLen = sc.nextInt();
        long numStopCodon = sc.nextLong();

        System.out.println((int) Math.pow(2, dnaSequenceLen - 3) * numStopCodon);

    }

}
