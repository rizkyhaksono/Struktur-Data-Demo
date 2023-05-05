package praktikum3.kegiatan1;

import java.util.Scanner;

public class StackReversed<T> {

    private T data[];

    public void push(T value) {
        if (data == null) {
            data = (T[]) new Object[1];
            data[0] = value;
        } else {
            T temp[] = (T[]) new Object[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            temp[data.length] = value;
            data = temp;
        }
    }

    public void show() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public void reversed() {
        for (int i = data.length - 1; i >= 0; i--) {
            System.out.print(data[i]);
        }
    }

    public static void main(String[] args) {
        StackReversed<String> stack = new StackReversed<>();
        StackReversed<Integer> stackInt = new StackReversed<>();

        // string
        stack.push("S");
        stack.push("t");
        stack.push("r");
        stack.push("u");
        stack.push("k");
        stack.push("t");
        stack.push("u");
        stack.push("r");
        stack.push("D");
        stack.push("a");
        stack.push("t");
        stack.push("a");

        // integer
        stackInt.push(1);
        stackInt.push(3);
        stackInt.push(4);
        stackInt.push(2);
        stackInt.push(5);

        System.out.print("\nMasukkan input: ");
        stack.show();
        System.out.print("\nReversed: ");
        stack.reversed();

        System.out.print("\nMasukkan input: ");
        stackInt.show();
        System.out.print("\nReversed: ");
        stackInt.reversed();

        // input an user
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("\nMasukkan input: ");
            String input = sc.nextLine();

            StackReversed<Character> stackChar = new StackReversed<>();

            for (int i = 0; i < input.length(); i++) {
                stackChar.push(input.charAt(i));
            }

            System.out.print("\nReversed: ");
            stackChar.reversed();
        }
    }
}
