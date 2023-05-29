/**
 @author: rizkyhaksono
 */

package praktikum5.kegiatan;

class Node<T> {
    T value;
    Node left;
    Node right;

    Node(T value) {
        this.value = value;
        left = null;
        right = null;
    }
}
