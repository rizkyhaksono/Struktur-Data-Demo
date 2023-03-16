/**
 @author: rizkyhaksono
 */

package praktikum4.latihan1;

import java.util.Stack;

public class ExampleStack {

    public static void main(String[] args) {
        Stack st = new Stack();

        st.push("Aku");
        st.push("Anak");
        st.push("Indonesia");

        System.out.println("Next element: " + st.peek());
        st.push("Raya");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("Aku");
        while (count != -1 && count > 1) {
            st.pop();
            count--;
        }

        System.out.println(st.pop());
        System.out.println(st.empty());
    }
}
