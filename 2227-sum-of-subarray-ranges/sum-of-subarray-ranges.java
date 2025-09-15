class Solution {
    public long subArrayRanges(int[] nums) {
        
        long total=0;
        long min,max;
        for(int i=0;i<nums.length;i++)
        {
            min=max=nums[i];
            for(int j=i;j<nums.length;j++)
            {
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                total+=(max-min);
            }

        }
        return total;
    }
}