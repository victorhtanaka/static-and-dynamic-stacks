import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StaticStack<String> pilhaNomes = new StaticStack<>(5);
        DynamicStack<Integer> pilhaNums = new DynamicStack<>();

        pilhaNomes.push("Victor");
        pilhaNomes.push("Matheus");
        pilhaNomes.push("Sam");
        pilhaNomes.push("Gabriela");

        for (int i = 0; i <= pilhaNomes.top; i++) {
            System.out.println(pilhaNomes.data[i]);
        }

        System.out.println(pilhaNomes.pop());
        pilhaNomes.pop();
        System.out.println(pilhaNomes.isFull());
        pilhaNomes.push("nome");
        System.out.println(pilhaNomes.isEmpty());

        pilhaNums.push(1);
        pilhaNums.push(2);
        pilhaNums.push(3);
        System.out.println(pilhaNums.top);
        System.out.println(pilhaNums.pop());
        System.out.println(pilhaNums.top);
        System.out.println(pilhaNums.isEmpty());
        System.out.println(Arrays.toString(pilhaNums.data));
    }
}