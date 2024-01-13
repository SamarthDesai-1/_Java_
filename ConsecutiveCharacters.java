public class ConsecutiveCharacters {

  public static int consecutive(String str) {
    if (str.length() == 1) return 1;
    StringBuilder temp = new StringBuilder();
    temp.append(str.charAt(0));

    int previous = 0; /* points to temp stringbuilder */
    int current = previous + 1; /* points to str */
    int max = Integer.MIN_VALUE;
    int consecutive = 1;

    while (current < str.length()) {
      if (temp.charAt(previous) == str.charAt(current)) {
        temp.append(str.charAt(current));
        consecutive++;
      } 
      else {
        consecutive = 1;
        temp.append(str.charAt(current));
      }
      max = Math.max(max, consecutive);
      previous++;
      current++;
    }

    return max;
  }

  public static void main(String[] args) {
    String str = "le";

    int consChars = consecutive(str);
    System.out.println("Longest Consecutive Characters are : " + consChars);
  }

}
