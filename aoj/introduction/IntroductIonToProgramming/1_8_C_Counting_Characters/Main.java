import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numberOfAlphabet = new int[26];

        while (sc.hasNext()) {

            String input = sc.next();

            for (int i = 0; i < input.length(); i++) {

                if (Character.isUpperCase(input.charAt(i))){

                    int num = (int) input.charAt(i) - 'A';
                    numberOfAlphabet[num]++;

                } else if (Character.isLowerCase(input.charAt(i))) {

                    int num = (int) input.charAt(i) - 'a';
                    numberOfAlphabet[num]++;

                }

            }

        }

        for (int i = 0 ; i < numberOfAlphabet.length; i++) {

            char alphabet = (char) ('a' + i);

            System.out.println(alphabet + " : " + numberOfAlphabet[i]);

        }

    }

}
