class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(Math.abs((long)nums[j] - nums[i]) <= t && Math.abs(j-i) <= k) return true;
            }
        }
        return false; 
    }
}