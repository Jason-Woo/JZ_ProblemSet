import java.util.Stack;

class CQueue {
    Stack<Integer> s1;
    Stack<Integer> s2;
    public CQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void appendTail(int value) {
        this.s1.push(value);
    }

    public int deleteHead() {
        int ans = 0;
        while (!s1.isEmpty()) {
            int tmp = s1.pop();
            s2.push(tmp);
        }
        if (s2.isEmpty()) {
            return -1;
        }
        ans = s2.pop();
        while (!s2.isEmpty()) {
            int tmp = s2.pop();
            s1.push(tmp);
        }
        return ans;
    }
}

