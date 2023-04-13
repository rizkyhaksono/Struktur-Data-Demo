/**
 @author: rizkyhaksono
 */

package praktikum6.latihan1;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTraversal {
    private int node;
    private LinkedList<Integer> adj[];
    private Queue<Integer> queue;

    BFSTraversal(int data) {
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
        BFSTraversal graph = new BFSTraversal(6);

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 3);
        graph.insertEdge(0, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(3, 5);
        graph.insertEdge(1, 2);
        graph.insertEdge(1, 0);
        graph.insertEdge(2, 1);
        graph.insertEdge(4, 1);
        graph.insertEdge(3, 1);
        graph.insertEdge(5, 4);
        graph.insertEdge(5, 3);
        System.out.println("Breadth First Traversal for the graph is: ");
        graph.BFS(0);
    }
}
