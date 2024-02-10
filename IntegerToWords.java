public class IntegerToWords {

  private static final String[] lessThan20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
      "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

  private static final String[] tens = { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

  private static final String[] thousands = { "", "Thousand", "Million", "Billion" };

  public static void main(String[] args) {
    int num = 12345;
    if (num == 0) {
      System.out.println("Zero");
      return;
    }
    StringBuilder result = new StringBuilder("");
    int i = 0;

    while (num > 0) {
      if (num % 1000 != 0) {
        System.out.println("num : " + (num % 1000));
        result.insert(0, helper(num % 1000) + thousands[i] + " ");
      }
      num /= 1000;
      i++;
    }

    System.out.println("English Words : " + result.toString().trim());
    return;
  }

  static String helper(int num) {
    if (num == 0) {
      return "";
    }
    else if (num < 20) {
      return lessThan20[num] + " ";
    }
    else if (num < 100) {
      return tens[num / 10] + " " + helper(num % 10);
    }
    else {
      return lessThan20[num / 100] + " Hundred " + helper(num % 100);
    }
  }
}
