import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int h = sc.nextInt();
            int w = sc.nextInt();

            if (h == 0 && w == 0) {
                break;
            }

            boolean[][] visited = new boolean[h][w];

            char[][] map = new char[h][w];

            for (int i = 0; i < h; i++) {
                map[i] = sc.next().toCharArray();
            }

            int x = 0;
            int y = 0;

            boolean isGoal = false;
            boolean isLoop = false;

            while (!isGoal) {

                if (visited[y][x]) {
                    System.out.println("LOOP");
                    isLoop = true;
                    break;
                }

                visited[y][x] = true;

                char tile = map[y][x];

                switch (tile) {

                    case '>' :
                        x++;
                        break;
                    case '<' :
                        x--;
                        break;
                    case '^' :
                        y--;
                        break;
                    case 'v' :
                        y++;
                        break;
                    case '.' :
                        isGoal = true;
                        break;

                }

            }

            if (!isLoop) {
                System.out.println(x + " " +y);
            }

        }

    }

}
