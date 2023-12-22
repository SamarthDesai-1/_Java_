public class IntegerToRoman {

    public static void toRoman(StringBuilder sb ,char major ,char minor ,char middle ,int val) {

        if (val <= 3) {
            for (int i = 1; i <= val; i++) {
                sb.append(minor);
            }
        } else if (val == 4) {
            sb.append(minor);
            sb.append(middle);
        } else if (val == 5) {
            sb.append(middle);
        } else if (val <= 8) {
            sb.append(middle);
            for (int i = 6; i <= val; i++) {
                sb.append(minor);
            }
        } else {
            sb.append(minor);
            sb.append(major);
        }

    }

    public static void main(String[] args) {
        int num = 3;

        StringBuilder sb = new StringBuilder();

        toRoman(sb, ' ', 'M', ' ', num / 1000);
        num %= 1000;

        toRoman(sb, 'M', 'C', 'D', num / 100);
        num %= 100;

        toRoman(sb, 'C', 'X', 'L', num / 10);
        num %= 10;

        toRoman(sb, 'X', 'I', 'V', num);

        System.out.println(sb);
    }
    
}
