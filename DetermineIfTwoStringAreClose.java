import java.util.Arrays;

public class DetermineIfTwoStringAreClose {

  public static boolean isClose(String str1 ,String str2) {
    if (str1.length() != str2.length()) return false;

    int[] freq1 = new int[26];
    int[] freq2 = new int[26];
    for (int i = 0; i < str1.length(); i++) {
      freq1[str1.charAt(i) - 'a']++;
    }
    for (int i = 0; i < str2.length(); i++) {
      freq2[str2.charAt(i) - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (freq1[i] == 0 && freq2[i] != 0 || freq1[i] != 0 && freq2[i] == 0) return false;
    }
    Arrays.sort(freq1);
    Arrays.sort(freq2);
    for (int i = 0; i < 26; i++) {
      if (freq1[i] != freq2[i]) return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String str1 = "cabbba";
    String str2 = "abbccc";
    boolean isClose = isClose(str1, str2);

    System.out.println(isClose);

  }
  
}
