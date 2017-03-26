public class Triangle1 {

    public static void main(String[] args) {

        int SIZE = 5;

        for (int i = 1; i <= SIZE; i++) {

            for(int j = 1; j <= i; j++) {

                System.out.print("*");

            }

            System.out.print("\n");

        }

    }

}

/*
--- result ---
*
**
***
****
*****
--------------
*/
