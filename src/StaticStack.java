public class StaticStack<T> extends ArrayStack<T> {
    public StaticStack(int capacity) {
        super(capacity);
    }

    @Override
    public void push(T data) {
        try {
            this.data[++top] = data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isFull() {
        return top == data.length - 1;
    }
}
