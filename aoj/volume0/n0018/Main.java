import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nums[] = new int[5];

        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        for (int i = nums.length - 1; i >= 1; i--) {

            for (int j = 0; j < i; j++) {

                if (nums[j] < nums[j + 1]) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }

            }

        }

        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println(nums[4]);

    }

}
