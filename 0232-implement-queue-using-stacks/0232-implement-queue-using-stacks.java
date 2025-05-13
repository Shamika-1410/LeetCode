class MyQueue {
    Stack<Integer> st1;
    public MyQueue() {
        st1 = new Stack<Integer>();
    }
    public void push(int x) {
      Stack<Integer> st2 =new Stack<Integer>(); 
      int n = st1.size();
      for(int i=0;i<n;i++){
        st2.push(st1.pop());
      }
      st1.push(x);
      for(int i=0;i<n;i++){
        st1.push(st2.pop());
      }
    }
    public int pop() {
        return st1.pop();
    }
    public int peek() {
        return st1.peek();
    }
    public boolean empty() {
       return st1.isEmpty(); 
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */