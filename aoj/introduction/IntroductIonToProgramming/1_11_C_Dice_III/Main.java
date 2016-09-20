import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Dice dice = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        Dice dice2 = new Dice(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());

        if (dice.equals(dice2)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}

class Dice implements Cloneable {

    private int top;
    private int front;
    private int right;
    private int left;
    private int back;
    private int bottom;

    public int getTop() {
        return top;
    }

    public int getFront() {
        return front;
    }

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }

    public int getBack() {
        return back;
    }

    public int getBottom() {
        return bottom;
    }

    public Dice(int top, int front, int right, int left, int back, int bottom) {
        this.top    = top;
        this.front  = front;
        this.right  = right;
        this.left   = left;
        this.back   = back;
        this.bottom = bottom;
    }

    public void roll(char s) {

        switch (s) {

            case 'E' :
                rollEast();
                break;

            case 'N' :
                rollNorth();
                break;

            case 'S' :
                rollSouth();
                break;

            case 'W' :
                rollWest();
                break;

            case 'R' :
                rollRight();
                break;

            case 'L' :
                rollLeft();
                break;

        }

    }

    public boolean changeSameDirection(Dice dice) {

        for (int i = 0; i < 4; i++) {

            if (isSameDirection(dice)) {
                return true;
            }

            dice.roll('N');

            for (int j = 0; j < 4; j++) {

                if (isSameDirection(dice)) {
                    return true;
                }

                dice.roll('R');

            }

        }

        for (int i = 0; i < 4; i++) {

            if (isSameDirection(dice)) {
                return true;
            }

            dice.roll('W');

            for (int j = 0; j < 4; j++) {

                if (isSameDirection(dice)) {
                    return true;
                }

                dice.roll('R');

            }

        }

        return false;

    }

    private boolean isSame(Dice dice) {
        return changeSameDirection(dice.clone());
    }

    private void rollEast() {
        int tmp = top;
        top     = left;
        left    = bottom;
        bottom  = right;
        right   = tmp;
    }

    private void rollNorth() {
        int tmp = top;
        top     = front;
        front   = bottom;
        bottom  = back;
        back    = tmp;
    }

    private void rollSouth() {
        int tmp = top;
        top     = back;
        back    = bottom;
        bottom  = front;
        front   = tmp;
    }

    private void rollWest() {
        int tmp = top;
        top     = right;
        right   = bottom;
        bottom  = left;
        left    = tmp;
    }

    private void rollRight() {
        int tmp = front;
        front   = left;
        left    = back;
        back    = right;
        right   = tmp;
    }

    private void rollLeft() {
        int tmp = front;
        front   = right;
        right   = back;
        back    = left;
        left    = tmp;
    }

    private boolean isSameDirection(Dice dice) {
        return (this.top    == dice.top   &&
                this.front  == dice.front &&
                this.right  == dice.right &&
                this.left   == dice.left  &&
                this.back   == dice.back  &&
                this.bottom == dice.bottom);
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Dice)) {
            return false;
        }

        Dice dice2 = (Dice) obj;

        return isSame(dice2);

    }

    @Override
    public Dice clone() {
        return new Dice(this.top, this.front, this.right, this.left, this.back, this.bottom);
    }

}
