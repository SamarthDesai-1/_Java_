import java.util.*;

public class MedianOfTwoSortedArray {

  public static void main(String[] args) {
    int[] nums1 = { 2, 9, 5, 6 };
    int[] nums2 = { 9, 2 };

    List<Double> l = new ArrayList<>();

    for (int i = 0; i < nums1.length; i++) 
      l.add((double) nums1[i]);
    
    for (int i = 0; i < nums2.length; i++) 
      l.add((double) nums2[i]);
    
    Collections.sort(l);

    int diff = l.size() % 2 == 0 ? 0 : 1;

    int x = 0;
    int y = l.size() - 1;
    while (x != y) {
      diff = y - x;
      if (diff == 1) {
        break;
      }
      x++;
      y--;
    }
    double ans = 0.000;
    if (diff == 1) 
      ans = ((double) l.get(x) + (double) l.get(y)) / 2;
    else 
      ans = (double) l.get(x);
    

    System.out.println("Median is : " + ans);
  }

}
