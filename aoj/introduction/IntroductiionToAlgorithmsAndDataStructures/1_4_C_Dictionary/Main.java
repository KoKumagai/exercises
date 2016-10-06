import java.util.Scanner;

public class Main {

    private static final int M = 2000000;
    private static String[] H = new String[M];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String command = sc.next();
            String date = sc.next();

            switch (command) {

                case "insert" :
                    insert(date);
                    break;

                case "find" :
                    System.out.println(find(date) ? "yes" : "no");
                    break;

            }

        }

    }

    private static int getChar(char c) {

        switch (c) {

            case 'A' :
                return 1;

            case 'C' :
                return 2;

            case 'G' :
                return 3;

            case 'T' :
                return 4;

        }

        return 0;

    }

    private static int getKey(char[] charArray) {

        int sum = 0;
        int p = 1;

        for (int i = 0; i < charArray.length; i++) {

            sum += p * getChar(charArray[i]);
            p *= 5;

        }

        return sum;

    }

    private static int h1(int key) {
        return key % M;
    }

    private static int h2(int key) {
        return 1 + (key % (M - 1));
    }

    private static boolean find(String s) {

        int key = getKey(s.toCharArray());

        int i = 0;
        while (true) {

            int h = (h1(key) + i * h2(key)) % M;

            if (s.equals(H[h])) {
                return true;
            } else if (H[h] == null) {
                return false;
            }

            i++;

        }

    }

    private static boolean insert(String str) {

        int key = getKey(str.toCharArray());

        int i = 0;
        while (true) {

            int h = (h1(key) + i * h2(key)) % M;

            if (str.equals(H[h])) {

                return true;

            } else if (H[h] == null) {

                H[h] = str;
                return false;

            }

            i++;

        }

    }

}
