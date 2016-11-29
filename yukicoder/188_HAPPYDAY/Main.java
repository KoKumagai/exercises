public class Main {

    public static void main(String[] args) {

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int count = 0;

        for (int i = 0; i < days.length; i++) {

            for (int j = 0; j < days[i]; j++) {

                if ((i + 1) == (j / 10) + (j % 10)) {
                    count++;
                }

            }

        }

        System.out.println(count);

    }

}
