class MyStack {
    Queue<Integer> qu;
    public MyStack() {
        qu=new LinkedList();
    }
    
    public void push(int x) {
        qu.add(x);
        int n=qu.size();
        while(n>1)
        {
            qu.add(qu.remove());
            n--;
        }
    }
    
    public int pop() {
        return qu.remove();
    }
    
    public int top() {
        return qu.element();
    }
    
    public boolean empty() {
        return qu.size()==0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */