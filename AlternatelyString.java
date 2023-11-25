public class AlternatelyString {

    public static void main(String[] args) {
        String s1 = "Dog";
        String s2 = "Elephant";

        StringBuilder sb = new StringBuilder("");
        int too = 0;

        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                } else {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                }
            }
            System.out.println(sb);
            return;
        }

        else if (s1.length() > s2.length()) {
            for (int i = 0; i < s2.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                } else {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                }
                too++;
            }

            if (too == s2.length()) {
                sb.append(s1.substring(too));
            }

            System.out.println(sb);
            return;
        }

        else if (s1.length() < s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                } else {
                    sb.append(s1.charAt(i));
                    sb.append(s2.charAt(i));
                }
                too++;
            }
            if (too == s1.length()) {
                sb.append(s2.substring(too));
            }

            System.out.println(sb);
            return;
        }
    }

}
