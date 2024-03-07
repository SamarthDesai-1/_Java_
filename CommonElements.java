import java.util.HashSet;

public class CommonElements {

  public static void main(String[] args) {
    int[] numsOne = { 3, 4, 2, 3 };
    int[] numsTwo = { 1, 5 };
    HashSet<Integer> hsOne = new HashSet<>();
    HashSet<Integer> hsTwo = new HashSet<>();

    for (int i = 0; i < numsOne.length; i++) {
      hsOne.add(numsOne[i]);
    }
    for (int i = 0; i < numsTwo.length; i++) {
      hsTwo.add(numsTwo[i]);
    }

    int first = 0;
    for (int i = 0; i < numsOne.length; i++) {
      if (hsTwo.contains(numsOne[i]))
        first++;
    }

    int second = 0;
    for (int i = 0; i < numsTwo.length; i++) {
      if (hsOne.contains(numsTwo[i]))
        second++;
    }

    System.out.println(first + " " + second);
    System.out.println(hsOne);
    System.out.println(hsTwo);
  }

}
