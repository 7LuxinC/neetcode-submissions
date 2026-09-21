class MinStack {
    private Stack<Long> st;
    private long min;

    public MinStack() {
        st = new Stack<>();
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long x = val;

        if (st.isEmpty()) {
            st.push(x);
            min = x;
        } else if (x >= min) {
            st.push(x);
        } else {
            st.push(2 * x - min);
            min = x;
        }
    }

    public void pop() {
        long x = st.peek();

        if (x < min) {
            min = 2 * min - x;
        }

        st.pop();
    }

    public int top() {
        long x = st.peek();

        if (x < min) {
            return (int) min;
        }

        return (int) x;
    }

    public int getMin() {
        return (int) min;
    }
}