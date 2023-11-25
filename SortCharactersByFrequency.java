import java.util.*;

public class SortCharactersByFrequency {

    public static class Sort implements Comparable<Sort> {
        char ch;
        int frequency;

        Sort(char ch, int frequency) {
            this.ch = ch;
            this.frequency = frequency;
        }

        @Override
        public int compareTo(Sort y) {
            return y.frequency - this.frequency;
        }
    }

    public static void main(String[] args) {
        String str = "AAABBBBBBCCC";

        HashMap<Character, Integer> hm = new HashMap<>();
        PriorityQueue<Sort> pq = new PriorityQueue<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!hm.containsKey(ch)) {
                hm.put(ch, 1);
            } else {
                hm.put(ch, hm.get(ch) + 1);
            }
        }

        for (Map.Entry<Character, Integer> x : hm.entrySet()) {
            pq.add(new Sort(x.getKey(), x.getValue()));
        }

        StringBuilder sb = new StringBuilder("");

        while (pq.size() > 0) {
            Sort temp = pq.remove();
            char letter = temp.ch;
            int times = temp.frequency;
            
            int i = 1;
            while (i <= times) {
                sb.append(letter);
                i++;
            }
        }

        System.out.println(sb);

    }

}
