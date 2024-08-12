public abstract class ArrayStack<T> implements IStack<T> {
    protected int top = -1;
    protected Object[] data;

    public ArrayStack(int capacity) {
        this.data = new Object[capacity];
    }

    public ArrayStack() {
        this.data = new Object[1];
    }

    @Override
    public abstract void push(T data);

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack underflow");
        }
        return (T) this.data[top--];
    }

    @Override
    public void clear() {
        this.top = -1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }
}
