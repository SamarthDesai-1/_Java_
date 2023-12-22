import java.util.*;

public class ReverseVowelInAString {

    public static void main(String[] args) {
        String str = "aA";

        StringBuilder sb = new StringBuilder(str);

        System.out.println("Old StringBuilder : " + sb);

        Set<Character> s = new HashSet<>();
        s.add('a');
        s.add('e');
        s.add('i');
        s.add('o');
        s.add('u');
        s.add('A');
        s.add('E');
        s.add('I');
        s.add('O');
        s.add('U');

        int left = 0;
        int right = sb.length() - 1;

        while (left <= right) {
            boolean Lvalexists = s.contains(sb.charAt(left));
            boolean Rvalexists = s.contains(sb.charAt(right));

            if (Lvalexists == true && Rvalexists == true) {

                /* Swapping */

                char temp = sb.charAt(right);
                sb.setCharAt(right, sb.charAt(left));
                sb.setCharAt(left, temp);

                left++;
                right--;
            } else if (Lvalexists == false)
                left++;
            else
                right--;
        }

        System.out.println("New StringBuilder : " + sb);

    }

}
