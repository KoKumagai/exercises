import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ID = sc.next();

        int len = ID.length();

        if ((ID.charAt(len - 2) == 'a') && (ID.charAt(len - 1) == 'i')) {

            for (int i = 0; i < len - 2; i++) {
                System.out.print(ID.charAt(i));
            }

            System.out.println("AI");

        } else {

            System.out.println(ID + "-AI");

        }

    }

}
