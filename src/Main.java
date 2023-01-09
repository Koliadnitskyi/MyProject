import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int [] nums = {2,5,1,3,4,7};
        int n = 3;
        int y = 0;
        int[] nums2 = new int[nums.length];
        for (int w = 0; w < nums.length; w = w + 2) {
            nums2[w] = nums[y];
            y++;
        }
        int q = n;
        for (int w = 1; w < nums.length; w = w + 2) {
            nums2[w] = nums[q];
            q++;
        }
        System.out.println(Arrays.toString(nums2));
    }
}//Shuffle the Array