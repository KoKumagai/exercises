import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long budget = sc.nextLong();
        int numChildren = sc.nextInt();

        long numThousandYenBill = budget / 1000;
        long numBillPerChild = numThousandYenBill / numChildren;
        long moneyAmountPerChaild = numBillPerChild * 1000;

        System.out.println(moneyAmountPerChaild);

    }

}
