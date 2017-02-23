import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, List<Integer>> index = new TreeMap<String, List<Integer>>();

        while (sc.hasNext()) {

            String word = sc.next();

            int page = sc.nextInt();
            List<Integer> pageList = null;

            if (index.containsKey(word)) {
                pageList = index.get(word);
            } else {
                pageList = new ArrayList<Integer>();
            }

            pageList.add(page);
            index.put(word, pageList);

        }

        for (String word : index.keySet()) {

            System.out.println(word);

            StringBuilder sb = new StringBuilder();

            List<Integer> pageList = index.get(word);
            Collections.sort(pageList);

            for (int page : pageList) {
                sb.append(page + " ");
            }

            System.out.println(sb.toString().trim());

        }

    }

}
