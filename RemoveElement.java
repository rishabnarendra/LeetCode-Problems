class Solution {
    public int removeElement(int[] nums, int val) {
        int total = 0; 
        for(int i = 0; i < nums.length; i++) {
                if(nums[i] != val) {
                    int temp = nums[i];
                    nums[i] = nums[total]; 
                    nums[total] = temp; 
                    total++; 
                }
        }
        return total; 
    }
}