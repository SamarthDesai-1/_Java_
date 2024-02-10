import java.util.*;

public class SequentialDigits {

  static void sequentialDigit(int low, int high) {
    List<Integer> l = new ArrayList<>();
    StringBuilder sb = new StringBuilder("123456789");

    for (int i = 1; i <= 9; i++) {
      
      for (int j = 0; i + j <= 9; j++) {
        String val = sb.substring(j, i + j);
        int num = Integer.valueOf(val);
        if (num >= low && num <= high) {
          l.add(num);
        }
      }
    }
    System.out.println(l);
  }

  public static void main(String[] args) {
    int low = 1000;
    int high = 13000;
    sequentialDigit(low, high);
  }
  
}
