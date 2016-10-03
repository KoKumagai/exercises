import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack<Integer> s1 = new Stack<Integer>();
        Stack<int[]> s2 = new Stack<int[]>();

        String line = sc.nextLine();

        int sum = 0;

        for (int i = 0; i < line.length(); i++) {

            char ch = line.charAt(i);

            if (ch == '\\') {

                s1.push(i);

            } else if (ch == '/' && !(s1.empty())) {

                int j = s1.pop();
                int a = i - j;

                sum += a;

                while (!(s2.empty()) && s2.peek()[0] > j) {

                    a += s2.peek()[1];
                    s2.pop();

                }

                s2.push(new int[]{j, a});

            }

        }

        System.out.println(sum);
        System.out.print(s2.size());

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (!(s2.empty())) {

            list.add(s2.peek()[1]);
            s2.pop();

        }

        Collections.reverse(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(" " + list.get(i));
        }

        System.out.println();

    }

}
