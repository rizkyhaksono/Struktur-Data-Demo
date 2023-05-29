/**
 @author: rizkyhaksono
 */

package praktikum5.kegiatan;

import java.util.Scanner;

/**
 * Created by rizkyhaksono on 15/05/23.
 * 
 * @Project: CoffeeShop
 * 
 * @File: CoffeeShop.java
 * 
 * @Desc: Program ini digunakan untuk menyimpan data customer dan mengurutkan
 *        sesuai post order, in order, dan pre order.
 * 
 */

public class CoffeeShop<T> {
    Node<T> root;

    Node insert(Node<T> root, T value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        // if (value.compareTo(root.value) <= 0) {
        // root.left = insert(root.left, value);
        // } else {
        // root.right = insert(root.right, value);
        // }

        if (value.toString().compareTo(root.value.toString()) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }

        return root;
    }

    void printTree(Node<T> node) {
        if (node != null) {
            printTree(node.left);
            System.out.println(node.value);
            printTree(node.right);
        }
    }

    void preorderTraversal(Node<T> node) {
        if (node != null) {
            System.out.println(node.value);
            preorderTraversal(node.left);
            preorderTraversal(node.right);
        }
    }

    void inorderTraversal(Node<T> node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.println(node.value);
            inorderTraversal(node.right);
        }
    }

    void postorderTraversal(Node<T> node) {
        if (node != null) {
            postorderTraversal(node.left);
            postorderTraversal(node.right);
            System.out.println(node.value);
        }
    }

    public static void main(String[] args) {
        CoffeeShop binaryTree = new CoffeeShop();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Masukkan jumlah nilai yang akan dimasukkan: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
                String value = scanner.next();
                binaryTree.root = binaryTree.insert(binaryTree.root, value);
            }
        }

        System.out.println("Binary Tree:");
        binaryTree.printTree(binaryTree.root);

        System.out.println("\nPreorder Traversal:");
        binaryTree.preorderTraversal(binaryTree.root);

        System.out.println("\nInorder Traversal:");
        binaryTree.inorderTraversal(binaryTree.root);

        System.out.println("\nPostorder Traversal:");
        binaryTree.postorderTraversal(binaryTree.root);
    }
}