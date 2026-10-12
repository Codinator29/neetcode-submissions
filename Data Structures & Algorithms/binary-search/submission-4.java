class Solution {
    public int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while(i <= j){
            int k = (i + j) / 2;

            if(target == nums[k])
                return k;
            else if(target < nums[k])
                j = k - 1;
            else if(target > nums[k])
                i = k + 1;
        }

        return -1;
    }
}
