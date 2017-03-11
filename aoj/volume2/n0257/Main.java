import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int basicTicket = sc.nextInt();
        int expressTicket = sc.nextInt();
        int basicExpressTicket = sc.nextInt();

        if ((basicTicket == 1 && expressTicket == 1) || (basicExpressTicket == 1)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }

    }

}
