class MinStack {
    Stack<Object> st;
    int min;
    public MinStack() {
        st=new Stack<Object>();
        min=Integer.MAX_VALUE;
    }
    public void push(int val) {
        if(val<min)min=val;
        Object o = new Object(val);
        o.min = min;
        st.push(o);
    }
    public void pop() {
        st.pop();
        if(st.isEmpty())min=Integer.MAX_VALUE;
        else min=st.peek().min;
    }
    public int top() {
        return st.peek().data;
    }
    public int getMin() {
        return st.peek().min;
    }
}
class Object{
    int data;
    int min;
    Object(int x){
        data=x;
    }
}
/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */