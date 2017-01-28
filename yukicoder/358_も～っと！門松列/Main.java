import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int left = sc.nextInt();
        int middle = sc.nextInt();
        int right = sc.nextInt();

        if (isKadomatsu(left, middle, right)) {
            System.out.println("INF");
            return;
        }

        int kadomatsuMax = Math.max(left, Math.max(middle, right));

        int kadomatsuCount = 0;

        for (int p = 1; p <= kadomatsuMax; p++) {

            if (isKadomatsu((left % p), (middle % p), (right % p))) {
                kadomatsuCount++;
            }

        }

            System.out.println(kadomatsuCount);

    }

    public static boolean isKadomatsu(int left, int middle, int right) {

        if (left == middle || middle == right || left == right) {
            return false;
        }

        return (left < middle && right < middle) || (middle < left && middle < right);

    }

}
