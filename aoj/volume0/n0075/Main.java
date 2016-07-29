import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {

            String[] input = sc.next().split(",");

            int id = Integer.parseInt(input[0]);
            double weight = Double.parseDouble(input[1]);
            double height = Double.parseDouble(input[2]);
            double bmi = weight / (height * height);

            if (bmi >= 25) {
                System.out.println(id);
            }

        }

    }

}
