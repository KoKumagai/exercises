import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.next();

        Set<String> hm = new HashSet<String>();

        for (int i = 0; i < (1 << S.length()); i++) {

            int left = 0;
            int right = S.length() - 1;

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < S.length(); j++) {

                if ((( i >> j) % 2 ) == 0) {

                    sb.append(S.charAt(left));
                    left++;

                } else {

                    sb.append(S.charAt(right));
                    right--;

                }

            }

            hm.add(sb.toString());

        }

        System.out.println(hm.size());

    }

}
