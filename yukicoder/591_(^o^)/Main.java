import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char eye = sc.next().charAt(0);
        char mouth = sc.next().charAt(0);

        System.out.println("(" + eye + mouth + eye + ")/");

    }

}
