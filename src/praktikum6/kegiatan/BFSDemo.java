/**
 @author: rizkyhaksono
 */

package praktikum6.kegiatan;

import java.util.LinkedList;
import java.util.Queue;

public class BFSDemo {

    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    BFSDemo(int data) {
        node = data;
        adj = new LinkedList[data];

        for (int i = 0; i < data; i++) {
            adj[i] = new LinkedList<>();
        }

        queue = new LinkedList<Integer>();
    }

    void insertEdge(int i, int j) {
        adj[i].add(j);
    }

    void BFS(int i) {
        boolean nodes[] = new boolean[node];
        int a = 0;
        nodes[i] = true;
        queue.add(i);

        while (queue.size() != 0) {
            i = queue.poll();
            System.out.print(i + " ");

            for (int j = 0; j < adj[i].size(); j++) {
                a = adj[i].get(j);

                if (!nodes[a]) {
                    nodes[a] = true;
                    queue.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFSDemo graph = new BFSDemo(12);

        graph.insertEdge(1, 4);
        graph.insertEdge(1, 2);
        graph.insertEdge(2, 1);
        graph.insertEdge(2, 5);
        graph.insertEdge(4, 6);
        graph.insertEdge(5, 2);
        graph.insertEdge(5, 3);
        graph.insertEdge(5, 7);
        graph.insertEdge(6, 7);
        graph.insertEdge(7, 6);
        graph.insertEdge(7, 11);
        graph.insertEdge(9, 5);
        graph.insertEdge(9, 8);
        graph.insertEdge(8, 11);
        graph.insertEdge(11, 10);

        System.out.println("Breadth first traversal for the graph is: ");
        graph.BFS(1);
    }
}
