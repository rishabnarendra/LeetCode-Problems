class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0; 
        for(int i = 0; i < A.length; i++) sum += A[i];
        
        if(sum % 3 != 0) return false; 
        
        int partitions = 0, partitionSum = 0; 
        for(int i = 0; i < A.length; i++) {
            partitionSum += A[i]; 
            if(partitionSum == (sum / 3)) {
                partitions++; 
                partitionSum = 0; 
            }
        }
        
        return (partitions == 3); 
    }
}