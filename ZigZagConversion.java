import java.util.*;

public class ZigZagConversion {

  public static String getConversion(String str, int rows) {
    if (rows == 1) return str;
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < rows; i++) {
      int idx = i;
      int deltaSouth = 2 * (rows - 1 - i);
      int deltaNorth = 2 * i;
      boolean goingSouth = true;

      while (idx < str.length()) {
        sb.append(str.charAt(idx));

        if (i == 0)
          idx += deltaSouth;
        else if (i == rows - 1)
          idx += deltaNorth;
        else {
          if (goingSouth)
            idx += deltaSouth;
          else
            idx += deltaNorth;

          goingSouth = goingSouth == true ? false : true; /* Alternate way is goingSouth = !goingSouth */
        }
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String str = sc.next();
    System.out.print("Enter rows : ");
    int rows = sc.nextInt();

    System.out.println("ZigZag string is : " + getConversion(str, rows));
  }

}


