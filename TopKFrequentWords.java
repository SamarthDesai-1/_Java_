import java.util.*;

public class TopKFrequentWords {

    public static class Sort implements Comparable<Sort> {
        String str;
        int frequency;

        Sort(String str, int frequency) {
            this.str = str;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Sort x) {
            if (x.frequency == this.frequency)
                return this.str.compareTo(x.str);

            return x.frequency - this.frequency;
        }
    }

    public static void main(String[] args) {
        String[] words = { "Amsterdam", "Switzerland", "Hong Kong", "Switzerland" ,"Japan" ,"Amsterdam"};
        int k = 2;

        HashMap<String, Integer> hm = new HashMap<>();
        PriorityQueue<Sort> pq = new PriorityQueue<>();

        for (int i = 0; i < words.length; i++) {
            if (!hm.containsKey(words[i])) {
                hm.put(words[i], 1);
            } else {
                hm.put(words[i], hm.get(words[i]) + 1);
            }
        }

        for (String word : hm.keySet()) {
            pq.add(new Sort(word, hm.get(word)));
        }

        List<String> ans = new ArrayList<>();
        while (k-- != 0) {
            ans.add(pq.remove().str);
        }

        System.out.println(ans);

    }

}
