class Solution {
    public int[] prevSmallest(int h[])
    {
        int prevs[]=new int[h.length];
        Stack<Integer> st=new Stack();

        for(int i=0;i<h.length;i++)
        {
            while(!st.isEmpty() && h[st.peek()]>h[i])
                st.pop();

            prevs[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return prevs;
    }
    public int[] nextSmallest(int h[])
    {
        int nexts[]=new int[h.length];
        Stack<Integer> st=new Stack();

        for(int i=h.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && h[st.peek()]>=h[i])
                st.pop();

            nexts[i]=st.isEmpty()?h.length:st.peek();
            st.push(i);
        }
        return nexts;
    }
    public int largestRectangleArea(int[] heights) {
        int []prevs=prevSmallest(heights);
        int []nexts=nextSmallest(heights);

        int large=0;
        for(int i=0;i<heights.length;i++)
        {
            int left=prevs[i];
            int right=nexts[i];
            int val=((right-left)-1)*heights[i];

            large=Math.max(large,val);
        }
        return large;
    }
}