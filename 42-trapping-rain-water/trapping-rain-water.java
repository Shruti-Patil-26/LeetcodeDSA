class Solution {
    public int trap(int[] height) {
        
        int []premax=new int[height.length];
        premax[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            premax[i]=Math.max(height[i],premax[i-1]);
        }

        int []sufmax=new int[height.length];
        sufmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--)
        {
            sufmax[i]=Math.max(height[i],sufmax[i+1]);
        }


        int total=0;
        for(int i=0;i<height.length;i++)
        {
            int leftmax=premax[i];
            int rightmax=sufmax[i];
            if(height[i]<leftmax && height[i]<rightmax)
            {
                total+=Math.min(leftmax,rightmax)-height[i];
            }
        }
        return total;
    }
}