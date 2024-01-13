import java.util.*;

public class MostCommonStrings {

  static HashSet<String> hs = new HashSet<>();

  static String cleanString(String str) {
    hs.add(".");
    hs.add(",");
    hs.add("!");
    hs.add("'");
    hs.add("?");
    hs.add(";");
    StringBuilder processString = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (hs.contains(ch + "")) continue;

      if (ch == ' ') processString.append(' ');
      else processString.append(ch);
    }

    return processString.toString();
  }

  static void commonWord(String cleanString ,String[] banned) {

    String[] array = cleanString.toLowerCase().split(" ");

    ArrayList<String> list = new ArrayList<>();

    for (int i = 0; i < array.length; i++) {
      list.add(array[i]);
    }
    for (int i = 0; i < banned.length; i++) {
      for (int j = 0; j < list.size(); j++) {
        if (banned[i].equals(list.get(j))) list.remove(j);
      }
    }

    HashMap<String ,Integer> hm = new HashMap<>();

    for (int i = 0; i < list.size(); i++) {
      if (!hm.containsKey(list.get(i))) hm.put(list.get(i), 1);
      else hm.put(list.get(i), hm.get(list.get(i)) + 1);
    }

    String ans = "";
    int max = Integer.MIN_VALUE;
    for (Map.Entry<String ,Integer> x : hm.entrySet()) {
      if (x.getValue() > max) {
        ans = x.getKey();
        max = x.getValue();
      }
    }

    System.out.println(ans);
    System.out.println(hm);
  }

  public static void main(String[] args) {
    String str = "a, a, a, a, b,b,b,c, c";
    String[] banned = { "a" };
    String cleanString = cleanString(str);

    commonWord(cleanString, banned);
    
  }
}