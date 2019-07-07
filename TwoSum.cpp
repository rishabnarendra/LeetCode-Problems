class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        for(int i = 0; i < nums.size(); i++){
            for(int j = 1; j < nums.size(); j++){
                if(nums[i] + nums[j] == target && i != j){
                    vector<int> values; 
                    values.push_back(i);
                    values.push_back(j);
                    return values;
                }
            }
        }
        return {};
    } 
};