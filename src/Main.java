import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int arraySize = nums.length * 2;
        int[] nums2 = new int[arraySize];
        int e = 0;
        for (int r = 0; r < nums2.length; r++) {
            nums2[r] = nums[e];
            e++;
            if (e == nums.length) {
                e = 0;
            }
        }
        System.out.println(Arrays.toString(nums2));
    }
}