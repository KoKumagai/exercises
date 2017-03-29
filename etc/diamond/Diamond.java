public class Diamond {

    public static void main(String[] args) {

        int SIZE = 5;

        for (int i = 0; i < SIZE; i++) {

            for (int j = 0; j < SIZE - (i + 1); j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

        for (int i = 1; i < SIZE; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (SIZE - i) * 2 - 1; j++) {
                System.out.print("*");
            }

            System.out.print("\n");

        }

    }

}

/*
--- result ---
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
--------------
*/
