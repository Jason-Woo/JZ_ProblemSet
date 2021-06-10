import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public int[] reversePrint(ListNode head) {
        Stack<Integer> s = new Stack<Integer>();
        while (head != null) {
            s.push(head.val);
            head = head.next;
        }
        int size = s.size();
        int[] ans = new int[size];
        for (int i = 0; i < size; i++) {
            ans[i] = s.pop();
        }
        return ans;
    }
}