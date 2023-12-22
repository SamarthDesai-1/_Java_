public class DetectCapital {

    public static void main(String[] args) {
        String str = "samarth"; 
        boolean firstIsCapital = str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' ? true : false;

        StringBuilder sb = new StringBuilder(str);
        if (firstIsCapital) {
            System.out.println(sb);
            for (int i = 0; i < sb.length(); i++) {
                if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    sb.setCharAt(i, '0'); /* Zero indicates Capital */
                } else sb.setCharAt(i, '1'); /* One indicates Small  */
            }
            System.out.println(sb);
        }

        else {
            for (int i = 0; i < sb.length(); i++) {
                if (i == sb.length() - 1){
                    boolean flag = str.charAt(i - 1) >= 'a' && str.charAt(1) <= 'z' ? true : false;
                    if (flag) sb.setCharAt(i, '1');
                    break;
                } 
                if (sb.charAt(i)  >= 'a' && sb.charAt(i + 1) <= 'z') {
                    sb.setCharAt(i, '1');
                }
                else continue;
            }
            System.out.println(sb);
        }


        for (int i = 1; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) continue;
            else {
                System.out.println(false);
                return;
            }    

        }

        System.out.println(true);
    }

}
