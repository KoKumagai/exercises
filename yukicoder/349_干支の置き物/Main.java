import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<String, Integer> zodiac = new HashMap<String, Integer>();

        for (int i = 0; i < N; i ++) {

            String animal = sc.next();

            if (zodiac.containsKey(animal)) {
                zodiac.put(animal , zodiac.get(animal) + 1);
            } else {
                zodiac.put(animal, 1);
            }

        }

        int animalMax = 0;

        for (int numAnimal : zodiac.values()) {
            animalMax = Math.max(animalMax, numAnimal);
        }

        if (animalMax - 1 <= N - animalMax) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
