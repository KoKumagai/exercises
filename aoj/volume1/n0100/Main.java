import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            int n = sc.nextInt();

            if (n == 0) {
                break;
            }

            Map<Integer, Long> sales = new LinkedHashMap<Integer, Long>();

            for (int i = 0; i < n; i++) {

                int employeeId = sc.nextInt();
                long price = sc.nextLong();
                long quantity = sc.nextLong();

                if (! sales.containsKey(employeeId)) {
                    sales.put(employeeId, 0l);
                }

                sales.put(employeeId, sales.get(employeeId) + (price * quantity));

            }

            boolean isOverOneMillion = false;

            for (int id : sales.keySet()) {

                if (1000000 <= sales.get(id)) {

                    System.out.println(id);
                    isOverOneMillion = true;

                }

            }

            if (! isOverOneMillion) {
                System.out.println("NA");
            }

        }

    }

}
