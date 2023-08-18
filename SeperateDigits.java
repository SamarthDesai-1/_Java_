import java.util.ArrayList;

public class SeperateDigits {

    public static void main(String[] args) {
        int[] nums = { 45153, 85, 25, 36, 78, 14, 142536, 966666 };
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]);
        }
        System.out.println(sb);

        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            int digit = ascii - 48;
            if (ch == '-') {
                continue;
            } else {
                al.add(digit);
            }
        }
        System.out.println(al);
    }
}
