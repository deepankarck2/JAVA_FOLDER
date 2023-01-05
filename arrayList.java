import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>(Arrays.asList(3, 4, 5, 6, 2));
        System.out.println(newList);

        String[] words = { "My name us this", "this" };

        ArrayList<String> sentense = new ArrayList<>();

        for (String w : words) {
            sentense.add(w);
        }
        for (String i : sentense) {
            System.out.println(i);
        }
    }

    // 2D ArrayList , 2D List
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int cur_sum = nums[i] + nums[l] + nums[r];
                if (cur_sum < 0) {
                    l++;
                } else if (cur_sum > 0) {
                    r--;
                } else {
                    ans.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++;
                    }
                }
            }
        }

        return ans;
    }

}
