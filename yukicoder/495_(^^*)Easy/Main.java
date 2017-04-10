import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] emoticons = sc.next().toCharArray();

        int countLeft = 0;
        int countRight = 0;

        for (int i = 0; i < emoticons.length; i++) {

            if (emoticons[i] == '*') {

                if (emoticons[i + 1] == ')') {
                    countLeft ++;
                } else if (emoticons[i + 1] == '^') {
                    countRight ++;
                }

            }

        }

        System.out.println(countLeft + " " + countRight);

    }

}
