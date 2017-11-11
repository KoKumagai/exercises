import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int answer = sc.nextInt();

        while (true) {

            String operation = sc.next();

            switch (operation){
                case "+":
                    answer += sc.nextInt();
                    break;
                case "-":
                    answer -= sc.nextInt();
                    break;
                case "*":
                    answer *= sc.nextInt();
                    break;
                case "/":
                    answer /= sc.nextInt();
                    break;
            }

            if (operation.equals("=")) {
                break;
            }

        }

        System.out.println(answer);

    }

}
