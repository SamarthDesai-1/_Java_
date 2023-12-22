public class ReverseWordsInAString {

    public static void main(String[] args) {
        String str = "a good   example 4651320";

        System.out.println(str);

        String newStr = str.trim();
        newStr = newStr.replaceAll("\\s+", " ");

        String[] arr = newStr.split(" ");

        int left = 0 ,right = arr.length - 1;
        while (left <= right) {
            String temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }


        StringBuilder sb = new StringBuilder("");
        int indexer = 0;
        for (String x : arr) {
            if (indexer != 0) sb.append(" ");
            sb.append(x);
            indexer++;
        }
        String ans = sb.toString().trim();
        System.out.println(ans);
    }
    
}
