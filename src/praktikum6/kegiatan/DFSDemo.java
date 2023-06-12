/**
 @author: rizkyhaksono
 */

package praktikum6.kegiatan;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSDemo {
    private int vertices;
    private LinkedList<Integer>[] adj;

    DFSDemo(int v) {
        vertices = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void dfs(int startNode) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(startNode, visited);
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n]) {
                dfsUtil(n, visited);
            }
        }
    }

    public static void main(String[] args) {
        DFSDemo graph = new DFSDemo(20);

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

        System.out.println("Hasil DFS: ");
        graph.dfs(1);
    }
}
