import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String input = sc.next();

            int[] romanNumerals = new int[input.length()];

            for (int i = 0; i < input.length(); i++) {

                switch (input.charAt(i)) {
                    case 'I' :
                        romanNumerals[i] = 1;
                        break;
                    case 'V' :
                        romanNumerals[i] = 5;
                        break;
                    case 'X' :
                        romanNumerals[i] = 10;
                        break;
                    case 'L' :
                        romanNumerals[i] = 50;
                        break;
                    case 'C' :
                        romanNumerals[i] = 100;
                        break;
                    case 'D' :
                        romanNumerals[i] = 500;
                        break;
                    case 'M' :
                        romanNumerals[i] = 1000;
                        break;
                }

            }

            int prev = 0;
            int arabicNumerals = 0;

            for (int i = input.length() - 1; i >= 0; i--) {

                if (prev <= romanNumerals[i]) {
                    arabicNumerals += romanNumerals[i];
                } else {
                    arabicNumerals -= romanNumerals[i];
                }

                prev = romanNumerals[i];

            }

            System.out.println(arabicNumerals);

        }

    }

}
