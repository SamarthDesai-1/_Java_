import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<String> unique = new HashSet<>();

        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1;
                int right = nums.length - 1;
                while (left <= right) {
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[left];
                    sum += nums[right];

                    if (sum > target) {
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]);
                        sb.append(nums[j]);
                        sb.append(nums[left]);
                        sb.append(nums[right]);
                        String code = sb.toString();
                        if (unique.contains(code) == false) {
                            unique.add(code);
                            ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        }
                        left++;
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 2, 2 };
        int target = 8;
        Arrays.sort(nums);
        System.out.println(fourSum(nums, target));

    }
}
