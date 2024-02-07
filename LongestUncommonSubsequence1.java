public class LongestUncommonSubsequence1 {

  public static void main(String[] args) {

    String a = "aefawfawfawfaw";
    String b = "aefawfeawfwafwaef";

    int ans = a.equals(b) ? 1 : Math.max(a.length(), b.length());
    System.out.println(ans);
  }
  
}
