import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int taroScore = 0;
        int hanakoScore = 0;

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String taroAnimal = sc.next();
            String hanakoAnimal = sc.next();

            if (taroAnimal.compareTo(hanakoAnimal) == 0) {
                taroScore++;
                hanakoScore++;
            }

            if (taroAnimal.compareTo(hanakoAnimal) > 0) {
                taroScore += 3;
            }

            if (hanakoAnimal.compareTo(taroAnimal) > 0) {
                hanakoScore += 3;
            }

        }

        System.out.println(taroScore + " " + hanakoScore);

    }

}
