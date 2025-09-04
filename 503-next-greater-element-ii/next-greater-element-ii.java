class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int []sol=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int j=(i+1)%(nums.length);
            while(j!=i)
            {
                if(nums[i]<nums[j])
                {
                    sol[i]=nums[j];
                    break;
                }
                j=(j+1)%(nums.length);
            }
            if(j==i)
                sol[i]=-1;
        }
        return sol;
    }
}