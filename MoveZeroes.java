class Solution {
    public void moveZeroes(int[] nums) {
        int swapIndex = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                if(i == swapIndex) swapIndex++; 
                else {
                    nums[swapIndex] = nums[i];
                    nums[i] = 0;
                    swapIndex++;
                } 
            }
        }
    }
}