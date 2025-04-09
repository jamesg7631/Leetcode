import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

    }
}

class MinStack {
    private LinkedList<Integer> stack;
    private LinkedList<Integer> minStack;
    public MinStack() {
        this.stack = new LinkedList<>();
        this.minStack = new LinkedList<>();
    }

    public void push(int val) {
        stack.addFirst(val);
        if (minStack.isEmpty()) {
            minStack.addFirst(val);
        } else {
            int peek = minStack.peekFirst();
            if (val < peek) {
                minStack.addFirst(val);
            } else {
                minStack.addFirst(peek);
            }
        }
    }

    public void pop() {
        stack.removeFirst();
        minStack.removeFirst();
    }

    public int top() {
        int top = stack.peekFirst();
        return top;
    }

    public int getMin() {
        return minStack.peekFirst();
    }
}

class Solution {
}
