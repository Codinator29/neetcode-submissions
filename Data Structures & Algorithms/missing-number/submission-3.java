// class Solution {
//     public int missingNumber(int[] nums) {
//         int result = 0;
//         Arrays.sort(nums);
//         for(int i = 0; i < nums.length; i++){
//             if(i != nums[i]){
//                 return i;
//             }
//         }

//         return nums.length;
//     }
// }
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorr = n;
        for (int i = 0; i < n; i++) {
            xorr ^= i ^ nums[i];
        }
        return xorr;
    }
}