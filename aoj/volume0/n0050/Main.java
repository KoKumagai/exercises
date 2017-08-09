import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String input = sc.nextLine();

            String replaced = input.replace("apple", "*");
            replaced = replaced.replace("peach", "apple");
            replaced = replaced.replace("*", "peach");

            System.out.println(replaced);

        }

    }

}
