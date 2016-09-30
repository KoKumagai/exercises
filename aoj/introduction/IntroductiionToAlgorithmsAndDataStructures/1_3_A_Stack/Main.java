import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        MyStack stack = new MyStack();

        while (sc.hasNext()) {

            String ope = sc.next();

            int a;
            int b;

            switch (ope) {

                case "+" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b + a);
                    break;
                case "-" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*" :
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;
                default :
                    stack.push(Integer.parseInt(ope));
                    break;

            }

        }

        System.out.println(stack.pop());

    }

}

class MyStack {

    private final int MAX_SIZE = 1000;
    private int[] stack;
    private int top;

    public MyStack() {
        stack = new int[MAX_SIZE];
        top = -1;
    }

    public void push(int num) {
        stack[++top] = num;
    }

    public int pop() {
        return stack[top--];
    }

}
