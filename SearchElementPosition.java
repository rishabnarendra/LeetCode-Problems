class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) return i; 
            int current = nums[i]; 
            if(target < current) return i;
            if(i != nums.length - 1) {
                int next = nums[i + 1];
                if(target < next) return i+1; 
            }
        }
        return nums.length; 
    }
}