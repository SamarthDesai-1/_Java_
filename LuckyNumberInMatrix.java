import java.util.*;

public class LuckyNumberInMatrix {

  public static void main(String[] args) {
    HashSet<Integer> hs = new HashSet<>();
    List<Integer> ans = new ArrayList<>();

    int[][] matrix = {
        { 1, 10, 4, 2 },
        { 9, 3, 8, 2 },
        { 15, 16, 17, 12 }
    };

    /* Find minimum in each row and store in a HashSet data structure */ {
      for (int i = 0; i < matrix.length; i++) {
        int min = Integer.MAX_VALUE;
        for (int j = 0; j < matrix[0].length; j++) {
          min = Math.min(min, matrix[i][j]);
        }
        hs.add(min);
      }
    }

    /* Find maximum in each column */ {
      List<Integer> maximum = new ArrayList<>();
      for (int i = 0; i < matrix[0].length; i++) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < matrix.length; j++) {
          max = Math.max(max, matrix[j][i]);
        }
        maximum.add(max);
      }

      /* Traverse on maximum list and check its same number is exists in hashset */ {
        for (int i = 0; i < maximum.size(); i++) {
          if (hs.contains(maximum.get(i))) {
            ans.add(maximum.get(i));
          }
        }
      }

    }
    System.out.println("Ans : " + ans);
    return;
  }

}
