import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long HEIGHT = sc.nextInt();
        long WIDTH = sc.nextInt();

        if (WIDTH < HEIGHT) {
            System.out.println("TATE");
        } else if (HEIGHT < WIDTH){
            System.out.println("YOKO");
        }

    }

}
