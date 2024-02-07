import java.util.*;

public class Dota2Senate {

  static String dota2Senate(StringBuilder sb){
    Queue<Integer> R = new ArrayDeque<>();
    Queue<Integer> D = new ArrayDeque<>();

    for (int i = 0; i < sb.length(); i++) {
      if (sb.charAt(i) == 'R') R.add(i);
      else D.add(i);
    }

    while (R.size() > 0 && D.size() > 0) {
      int Dturn = D.remove();
      int Rturn = R.remove();

      if (Rturn < Dturn) R.add(Dturn + sb.length());
      
      else D.add(Rturn + sb.length());
    }
    System.out.println(R + " " + D);

    return R.size() != 0 ? "Radient" : "Dire";
  }

  public static void main(String[] args) {
    String str = "RRDRD";

    StringBuilder sb = new StringBuilder(str);

    String winner = dota2Senate(sb);
    System.out.println(winner);
  }
  
}
