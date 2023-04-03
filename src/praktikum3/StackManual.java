/**
 @author: rizkyhaksono
 */

package praktikum3;

public class StackManual {

    private String stack;

    public void setStack(String st) {
        this.stack = st;
    }

    public String getStack() {
        return this.stack;
    }

    public void reverseStack() {
        String reverse = "";
        for (int i = this.stack.length() - 1; i >= 0; i--) {
            reverse += this.stack.charAt(i);
        }
        System.out.println(reverse);
    }

    public void printStack() {
        System.out.println(this.stack);
    }

    public static void main(String[] args) {
        StackManual stack = new StackManual();

        stack.setStack("Rizky");
        System.out.println("Before reverse: ");
        stack.printStack();
        System.out.println("After reverse: ");
        stack.reverseStack();
    }
}
