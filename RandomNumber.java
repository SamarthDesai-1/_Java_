import java.util.Random;

public class RandomNumber {

  public static void main(String[] args) {
    int min = 1;
    int max = 10;
    Random r = new Random();

    int rn = r.nextInt(max - min + 1) + min;

    System.out.println("Random Number : " + rn);
  }
}