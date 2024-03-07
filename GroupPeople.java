import java.util.*;

public class GroupPeople {

  public static void main(String[] args) {
    int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
    HashMap<Integer, List<Integer>> hm = new HashMap<>();
    List<List<Integer>> result = new ArrayList<>();

    for (int i = 0; i < groupSizes.length; i++) {
      if (hm.containsKey(groupSizes[i])) {
        hm.get(groupSizes[i]).add(i);
      } else {
        List<Integer> l = new ArrayList<>();
        l.add(i);
        hm.put(groupSizes[i], l);
      }
    }

    for (Map.Entry<Integer, List<Integer>> x : hm.entrySet()) {
      int groupLen = x.getKey();
      List<Integer> cache = hm.get(x.getKey());

      System.out.println("GroupLen : " + groupLen + " cache : " + cache);

      if (groupLen == cache.size()) {
        result.add(cache);
      } else {
        /** when key is less than list<Integer> size value */

        for (int i = 0; i < cache.size(); i++) {
          List<Integer> list = new ArrayList<>();

          for (int j = 0; j < cache.size(); ++j) {

            if (list.size() == groupLen) {
              cache.remove(0);
              break;
            } else
              list.add(cache.get(0));
            cache.remove(0);
          }
          if (cache.size() == 1)
          list.add(cache.get(0));
          result.add(list);
        }

      }
    }

    System.out.println(result);
  }

}
