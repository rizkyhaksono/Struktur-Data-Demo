/**
 @author: rizkyhaksono
 */

package praktikum6.kegiatan;

import java.util.Iterator;
import java.util.LinkedList;

class BFSDemo {
    private int V;
    private LinkedList<Integer>[] adjacencyList;

    BFSDemo(int v) {
        V = v;
        adjacencyList = new LinkedList[v];
        for (int i = 0; i < v; ++i) {
            adjacencyList[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int w) {
        adjacencyList[v].add(w);
    }

    void bfs(int startNode) {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[startNode] = true;
        queue.add(startNode);

        while (queue.size() != 0) {
            startNode = queue.poll();
            System.out.print(startNode + " ");

            Iterator<Integer> i = adjacencyList[startNode].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFSDemo graph = new BFSDemo(20);

        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 1);
        graph.addEdge(5, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 9);
        graph.addEdge(5, 7);
        graph.addEdge(9, 5);
        graph.addEdge(9, 8);
        graph.addEdge(4, 6);
        graph.addEdge(6, 7);
        graph.addEdge(4, 6);
        graph.addEdge(6, 7);
        graph.addEdge(7, 6);
        graph.addEdge(7, 11);
        graph.addEdge(8, 9);
        graph.addEdge(8, 11);
        graph.addEdge(11, 7);
        graph.addEdge(11, 10);

        System.out.println("Hasil BFS:");
        graph.bfs(1);
    }
}
