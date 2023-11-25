public class LetterPercentageInString {

    public static void main(String[] args) {
        String s = "foobar";
        char letter = 'o';

        int frequency = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter)
                frequency++;
        }

        System.out.println(frequency);
        if (frequency > 0) {
            double ans = ((double) frequency / s.length() * 100);
            System.out.println((int) ans);
            System.out.println("executed");
        } else {
            System.out.println(0);
        }

    }

}
