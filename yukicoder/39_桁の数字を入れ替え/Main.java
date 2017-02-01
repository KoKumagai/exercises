import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int inputNumber = sc.nextInt();

        char[] inputCharArray = String.valueOf(inputNumber).toCharArray();

        int max = inputNumber;

        for (int i = 0; i < inputCharArray.length; i++) {

            for (int j = i + 1; j < inputCharArray.length; j++) {

                char temp = inputCharArray[i];
                inputCharArray[i] = inputCharArray[j];
                inputCharArray[j] = temp;

                max = Math.max(max, Integer.parseInt(String.valueOf(inputCharArray)));

                temp = inputCharArray[i];
                inputCharArray[i] = inputCharArray[j];
                inputCharArray[j] = temp;

            }

        }

        System.out.println(max);

    }

}
