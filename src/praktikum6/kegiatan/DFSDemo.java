/**
 @author: rizkyhaksono
 */

package praktikum6.kegiatan;

import java.util.*;

public class DFSDemo {
    private int vertices;
    private LinkedList<Integer>[] adj;

    DFSDemo(int v) {
        vertices = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
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
        DFSDemo graph = new DFSDemo(7);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 5);
        graph.addEdge(2, 6);

        System.out.println("Hasil DFS: ");
        graph.dfs(0);
    }
}
