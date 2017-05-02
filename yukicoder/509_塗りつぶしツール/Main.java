import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[] nums = sc.next().toCharArray();

        int holesCount = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (num == '0' || num == '4' || num == '6' || num == '9') {
                holesCount++;
            }

            if (num == '8') {
                holesCount += 2;
            }

        }

        int min = Math.min(2 * nums.length + holesCount + 1, 2 * (holesCount + 1) + nums.length);

        System.out.println(min);

    }

}
