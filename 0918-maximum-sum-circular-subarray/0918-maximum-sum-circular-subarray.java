class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ts=nums[0];
        int cmax=nums[0];
        int max=nums[0];
        int cmin=nums[0];
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            cmax=Math.max(nums[i],cmax+nums[i]);
            max=Math.max(max,cmax);
            cmin=Math.min(nums[i],cmin+nums[i]);
            min=Math.min(min,cmin);
            ts+=num;
        }
        if(max<0){
        return max;
        }
        return Math.max(max,ts-min);
    }
}