import java.sql.SQLOutput;
import java.util.Arrays;

public class DynamicStack<T> extends ArrayStack<T>  {
    public DynamicStack() {
        super();
    }

    @Override
    public void push(T data) {
        try {
            if (this.top == this.data.length - 1) {
                Object[] newData = new Object[this.data.length * 2];

                for (int i = 0; i <= this.top; i++) {
                    newData[i] = this.data[i];
                }
                this.data = newData;
                System.out.println(Arrays.toString(this.data));
                System.out.println(this.data.length);
            }
            this.data[++top] = data;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
