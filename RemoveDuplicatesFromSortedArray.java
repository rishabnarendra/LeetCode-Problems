class Solution {
    public int removeDuplicates(int[] nums) {
        int duplicateCounter = nums.length; 
        for(int i = 0; i < duplicateCounter; i++) {
            for(int j = i+1; j < duplicateCounter; j++) {
                if(nums[i] == nums[j]) {
                    duplicateCounter--; 
                    for(int k = j; k < duplicateCounter; k++) {
                        nums[k] = nums[k+1]; 
                    }
                    j--;
                }
            }
        }
        return duplicateCounter; 
    }
}