public class CapitalizeTheTitle {

    public static void main(String[] args) {
        String title = "The is a good boy";
        if (title == null || title.isEmpty()) {
            return;
        }

        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) {
                result.append(words[i].toLowerCase());
            } else {
                result.append(Character.toUpperCase(words[i].charAt(0))).append(words[i].substring(1).toLowerCase());
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);

    }

}
