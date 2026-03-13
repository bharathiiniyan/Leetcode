class Solution {
    public int thirdMax(int[] nums) {
        int tmax=0;
        for(int i=1;i<nums.length;i++){
            if(nums.length>=3){
        if(nums[i-1]>nums[i])
            tmax=nums[i];
        }
        else{
            if(nums[i-1]<nums[i]){
                tmax=nums[i];
            }
        }
        }
        return tmax;
    }
}