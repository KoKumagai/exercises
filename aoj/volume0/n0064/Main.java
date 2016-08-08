import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int ciphertext = 0;

        while (sc.hasNext()) {

            String plaintext = sc.next();
            String[] nums = plaintext.split("[^0-9]");

            for (int i = 0; i < nums.length; i++) {

                if (!nums[i].equals("")) {
                    ciphertext += Integer.parseInt(nums[i]);
                }

            }

        }

        System.out.println(ciphertext);

    }

}
