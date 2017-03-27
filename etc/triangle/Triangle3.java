public class Triangle3 {

    public static void main(String[] args) {

        int SIZE = 5;

        for (int i = 1; i <= SIZE; i++) {

            for (int j = SIZE; j >= 1; j--) {

                if (j >= i) {
                    System.out.print("*");
                }

            }

            System.out.print("\n");

        }

    }

}

/*
--- result ---
*****
****
***
**
*
--------------
*/
