public class Solution {
    public boolean canJump(int[] nums) {
        // int goal = nums.length - 1;

        // for (int i = nums.length - 2; i >= 0; i--) {
        //     if (i + nums[i] >= goal) {
        //         goal = i;
        //     }
        // }

        // return goal == 0;

        int far = 0;
for (int i = 0; i < nums.length; i++) {
if (i > far) return false;
far = Math.max(far, i + nums[i]);
}
return true;
    }
}