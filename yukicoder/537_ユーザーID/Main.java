import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long N = sc.nextLong();

        Set<String> hs = new HashSet<String>();

        for (long i = 1; i * i <= N; i++) {

            if (N % i == 0) {

                String factorStr1 = Long.toString(i);
                String factorStr2 = Long.toString(N / i);

                hs.add(factorStr1 + factorStr2);
                hs.add(factorStr2 + factorStr1);

            }

        }

        System.out.println(hs.size());

    }

}
