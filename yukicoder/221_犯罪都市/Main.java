import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int mafia = (1_000_000 / 10_000) * N;
        int normalPeople = 1_000_000 - mafia;

        double arrestedMafia = mafia * 0.99;
        double arrestedNormalPeople = normalPeople * 0.01;

        double arrestedPeopleSum = arrestedMafia + arrestedNormalPeople;

        double mistakenArrestRate = arrestedNormalPeople / arrestedPeopleSum * 100;

        System.out.println(mistakenArrestRate);

    }

}
