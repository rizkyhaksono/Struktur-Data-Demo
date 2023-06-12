__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class DFS:
    def __init__(self):
        self.graph = {}

    def add_edge(self, u, v):
        if u in self.graph:
            self.graph[u].append(v)
        else:
            self.graph[u] = [v]

    def dfs_util(self, v, visited):
        visited.add(v)
        print(v, end=" ")

        if v in self.graph:
            for neighbor in self.graph[v]:
                if neighbor not in visited:
                    self.dfs_util(neighbor, visited)

    def dfs(self, start_node):
        # stack
        visited = set()
        self.dfs_util(start_node, visited)

if __name__ == '__main__':
    graph = DFS()

    graph.add_edge(1, 2)
    graph.add_edge(1, 4)
    graph.add_edge(2, 5)
    graph.add_edge(2, 1)
    graph.add_edge(5, 2)
    graph.add_edge(5, 3)
    graph.add_edge(5, 9)
    graph.add_edge(5, 7)
    graph.add_edge(9, 5)
    graph.add_edge(9, 8)
    graph.add_edge(4, 6)
    graph.add_edge(6, 7)
    graph.add_edge(7, 6)
    graph.add_edge(7, 11)
    graph.add_edge(8, 9)
    graph.add_edge(8, 11)
    graph.add_edge(11, 7)
    graph.add_edge(1, 10)

    print("Hasil DFS:")
    graph.dfs(1)