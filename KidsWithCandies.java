import java.util.*;

public class KidsWithCandies {

    public static void main(String[] args) {
        int[] candies = { 12, 1, 12 };
        int extraCandies = 10;
        List<Boolean> list = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            max = Math.max(max, candies[i]);
        }

        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if (candies[i] >= max)
                list.add(true);
            else
                list.add(false);
        }

        System.out.println(list);
    }

}
