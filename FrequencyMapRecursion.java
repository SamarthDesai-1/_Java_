import java.util.HashMap;

public class FrequencyMapRecursion {

    public static void getFrequency(int[] arr ,HashMap<Integer ,Integer> hm ,int start ,int end) {
        if (start > end) return;
        
        if (!hm.containsKey(arr[start])) hm.put(arr[start], 1);
        else hm.put(arr[start], hm.get(arr[start]) + 1);

        getFrequency(arr, hm, start + 1, end);

    }

    public static void main(String[] args) {
        int[] arr = { 7, 5, 1, 4, 2, 1, 52 ,7 };

        HashMap<Integer ,Integer> hm = new HashMap<>();

        getFrequency(arr ,hm ,0 ,arr.length - 1);

        System.out.println(hm);
    }

}
