public class DIString {

  public static void main(String[] args) {
    String str = "IIIDIDDD";
    int[] ans = new int[str.length() + 1];

    int I = 0;
    int D = str.length();
    int lastVal = 0;

    for (int j = 0; j < str.length(); j++) {
      if (str.charAt(j) == 'I') {
        ans[j] = I;
        I++;
      } else {
        ans[j] = D;
        D--;
      }
      lastVal = j;
    }
    ans[++lastVal] = I;
    System.out.println("I : " + I);
    System.out.println("D : " + D);

    for (int x : ans)
      System.out.print(x + " ");

  }

}
