import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int distributeCandies(int[] candies) {

        Set<Integer> kinds = new HashSet<Integer>();

        for (int candy : candies) {
            kinds.add(candy);
        }

        return Math.min(candies.length / 2, kinds.size());

    }

}
