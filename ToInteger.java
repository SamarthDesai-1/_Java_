public class ToInteger {

  public static void main(String[] args) {
    String str = "10101";

    int integer = 0;

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      
      if (ch == '1') {
        integer += Math.pow(2, str.length() - 1 - i);
      }
      else if (ch != '0') {
        throw new IllegalArgumentException("Invalid Binary String : " + ch);
      }
    }

    System.out.println(integer);
  }
  
}
