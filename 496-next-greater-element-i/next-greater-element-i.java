class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int sol[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    j++;
                    while(j<nums2.length)
                    {
                        if(nums2[j]>nums1[i])
                        {
                            sol[i]=nums2[j];
                            break;
                        }
                        j++;
                    }
                    if(j==nums2.length)
                    {
                        sol[i]=-1;
                        break;
                    }
                }
            }
        }

        return sol;
    }
}