class Solution {
    int[] nextSE(int arr[])
    {
        int nse[]=new int[arr.length];
        Stack<Integer> st=new Stack();

        for(int i=arr.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && arr[st.peek()]>=arr[i])
                st.pop();
            nse[i]=st.isEmpty()?arr.length:st.peek();
            st.push(i);
        }
        return nse;
    }
    int[] prevSE(int arr[])
    {
        int pse[]=new int[arr.length];
        Stack<Integer> st=new Stack();

        for(int i=0;i<arr.length;i++)
        {
            while(!st.isEmpty() && arr[st.peek()]>arr[i])
                st.pop();
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        return pse;
    }
    public int sumSubarrayMins(int[] arr) {
        int []nse=nextSE(arr);
        int []pse=prevSE(arr);

        long total=0;
        long mod=(long)1e9+7;
        for(int i=0;i<arr.length;i++)
        {
            int left=i-pse[i];
            int right=nse[i]-i;
            total=(total+(left*right*1L*arr[i])%mod)%mod;

        }
        return (int)total;
    }
}