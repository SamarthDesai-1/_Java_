import java.util.*;

public class AssignCookies {

  static int satisfyChildrens(int[] g, int[] s) {
    Arrays.sort(g);
    Arrays.sort(s);

    int i = 0;
    for (int j = 0; i < g.length && j < s.length; j++)
      if (g[i] <= s[i])
        i++;

    return i;
  }

  public static void main(String[] args) {
    int[] g = { 1, 2, 3 };
    int[] s = { 1, 1 };

    int result = satisfyChildrens(g, s);

    System.out.println("Max Content : " + result);

  }

}
