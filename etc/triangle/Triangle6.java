public class Triangle6 {

    public static void main(String[] args) {

        int SIZE = 5;

        for (int i = 0; i < SIZE; i++) {

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
*********
 *******
  *****
   ***
    *
--------------
*/
