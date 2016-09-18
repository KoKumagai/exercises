import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        char[] operations = sc.next().toCharArray();

        for (int i = 0; i < operations.length; i++) {
            dice.roll(operations[i]);
        }

        System.out.println(dice.getNum(0));

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

}
