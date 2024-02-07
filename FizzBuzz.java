import java.util.*;

public class FizzBuzz {

  static List<String> fizzBuzz_Approach_1(int n) {
    List<String> ans = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        ans.add("FizzBuzz");
      } else if (i % 3 == 0) {
        ans.add("Fizz");
      } else if (i % 5 == 0) {
        ans.add("Buzz");
      } else {
        ans.add(i + "");
      }
    }
    return ans;
  }

  static List<String> fizzBuzz_Approach_2(int n) {
    List<String> ans = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      ans.add(i % 15 == 0 ? "FizzBuzz" : i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "Fizz" : String.valueOf(i));
    }
    return ans;
  }

  public static void main(String[] args) {

    int n = 15;

    System.out.println(fizzBuzz_Approach_1(n));
    System.out.println(fizzBuzz_Approach_2(n));
  }
}