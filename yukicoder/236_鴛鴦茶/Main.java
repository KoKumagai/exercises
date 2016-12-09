import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double rateCoffee = sc.nextDouble();
        double rateTea = sc.nextDouble();

        double coffee = sc.nextDouble();
        double tea = sc.nextDouble();

        double lovebirdTea = (rateCoffee + rateTea) * Math.min(coffee/rateCoffee, tea/rateTea);

        System.out.println(lovebirdTea);

    }

}
