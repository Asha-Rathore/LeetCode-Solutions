import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicates {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (lastIndex.containsKey(nums[i])) {
                int j = lastIndex.get(nums[i]);
                if (i - j <= k) { // distance check
                    return true;
                }
            }
            lastIndex.put(nums[i], i); // update last seen index
        }

        return false;
    }

    static void main(String[] args) {
        int[] num = {1,2,3,1};
        int k = 3;
        containsNearbyDuplicate(num, k);
    }
}
