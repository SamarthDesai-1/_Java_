import java.util.*;

public class NextGreaterElementOne {

    public static void main(String[] args) {
        int[] nums1 = { 4, 1, 2 ,5 };  
        int[] nums2 = { 1, 3, 4, 2, 5 }; 
        ArrayList<Integer> al = new ArrayList<>();

        HashMap<Integer ,Integer> hm = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], i);
        }

        int index = -1;
        int counter = -1;
        for (int i = 0; i < nums1.length; i++) {

            if (hm.containsKey(nums1[i])) {
                index = hm.get(nums1[i]);
                counter = index;

                while (counter != nums2.length - 1 && nums2[index] > nums2[counter + 1]) counter++;
                
                if (counter == nums2.length - 1) al.add(-1);
                else al.add(nums2[counter + 1]);
            }
        }
        
        System.out.println(hm);
        System.out.println(al);


    }

}