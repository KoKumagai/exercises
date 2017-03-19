import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int objective = sc.nextInt();

            if (objective == 0) {
                break;
            }

            int numStudy = sc.nextInt();
            int studyTime = 0;

            for (int i = 0; i < numStudy; i++) {

                int startTime = sc.nextInt();
                int endTime = sc.nextInt();

                studyTime += endTime - startTime;

            }

            System.out.println(objective <= studyTime ? "OK" : (objective - studyTime));

        }

    }

}
