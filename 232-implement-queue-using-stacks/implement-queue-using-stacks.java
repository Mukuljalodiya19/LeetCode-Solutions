import java.util.Stack;
class MyQueue {
     private Stack<Integer>s1;
        private Stack <Integer>s2;
    public MyQueue() {
       s1 = new Stack<Integer>();
       s2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        s1.push(x);
    }
    
    public int pop() {
        while(s1.empty()==false){
            s2.push(s1.pop());
        }
        int x = s2.pop();
        while(s2.empty()==false){
            s1.push(s2.pop());
        }
        return x;
    }
    
    public int peek() {
         while(s1.empty()==false){
            s2.push(s1.pop());
    }
      int x = s2.peek();
        while(s2.empty()==false){
            s1.push(s2.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return s1.empty();
        
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