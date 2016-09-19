import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {

            int top = sc.nextInt();
            int front = sc.nextInt();

            dice.putTopFront(top, front);

            System.out.println(dice.getNum(2));

        }

    }

}

class Dice {

    private int numbers[];

    public int getNum(int i) {
        return numbers[i];
    }

    public Dice(int... numbers) {
        this.numbers = numbers;
    }

    public void roll(char s) {

        int tmp = numbers[0];

        switch (s) {

            case 'E':
                numbers[0] = numbers[3];
                numbers[3] = numbers[5];
                numbers[5] = numbers[2];
                numbers[2] = tmp;
                break;

            case 'N' :
                numbers[0] = numbers[1];
                numbers[1] = numbers[5];
                numbers[5] = numbers[4];
                numbers[4] = tmp;
                break;

            case 'S':
                numbers[0] = numbers[4];
                numbers[4] = numbers[5];
                numbers[5] = numbers[1];
                numbers[1] = tmp;
                break;

            case 'W':
                numbers[0] = numbers[2];
                numbers[2] = numbers[5];
                numbers[5] = numbers[3];
                numbers[3] = tmp;
                break;

        }

    }

    public void putTopFront (int top, int front) {

        for (int i = 0; i < 3; i++) {

            if (numbers[1] == front) {
                break;
            }

            roll('N');

        }

        if (numbers[1] != front) {

            roll('E');

            for (int i = 0; i < 3; i++) {

                if (numbers[1] == front) {
                    break;
                }

                roll('N');

            }

        }

        for (int i = 0; i < 3; i++) {

            if (numbers[0] == top) {
                break;
            }

            roll('E');

        }

    }

}
