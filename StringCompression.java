import java.util.*;

public class StringCompression {

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c', 'c' };
        StringBuilder sb = new StringBuilder("");
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if (!hm.containsKey(chars[i]))
                hm.put(chars[i], 1);
            else
                hm.put(chars[i], hm.get(chars[i]) + 1);
        }

        for (Map.Entry<Character, Integer> x : hm.entrySet()) {
            if (x.getValue() > 1)
                sb.append(x.getKey()).append(x.getValue());
            else
                sb.append(x.getKey());

        }
        chars = new char[sb.length()]; /*  */

        for (int i = 0; i < sb.length(); i++) {
            chars[i] = sb.charAt(i);
        }

        System.out.println("Compress String : " + sb + " Compress String Length : " + sb.length());

        for (char element : chars)
            System.out.print(element + " ");
    }

}

