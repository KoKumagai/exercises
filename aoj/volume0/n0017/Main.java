import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {

            char[] line = sc.nextLine().toCharArray();

            for (int i = 0; i < 26; i++) {

                char[] decryptionChArry = new char[line.length];

                for (int j = 0; j < line.length; j++) {

                    char ch = line[j];

                    if (ch != ' ' && ch != '.') {
                        ch = (char) ((ch - 'a' + i) % 26 + 'a');
                    }

                    decryptionChArry[j] = ch;

                }

                String decryption = new String(decryptionChArry);

                if (decryption.indexOf("the") != -1 || decryption.indexOf("this") != -1 || decryption.indexOf("that") != -1) {
                    System.out.println(decryption);
                    break;
                }

            }

        }

    }

}
