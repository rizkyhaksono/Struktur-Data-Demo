from collections import deque
__author__ = "rizkyhaksono"
__copyright__ = "Copyright 2023, Malang"


class BFS:
    def __init__(self):
        self.graph = {}

    def add_edge(self, u, v):
        if u in self.graph:
            self.graph[u].append(v)
        else:
            self.graph[u] = [v]

    def bfs(self, start_node):
        visited = set()
        # queue
        queue = deque()
        queue.append(start_node)

        while queue:
            vertex = queue.popleft()
            if vertex not in visited:
                print(vertex, end=" ")
                visited.add(vertex)

                if vertex in self.graph:
                    for neighbor in self.graph[vertex]:
                        if neighbor not in visited:
                            queue.append(neighbor)


if __name__ == '__main__':
    graph = BFS()

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
    graph.add_edge(11, 10)

    print("Hasil BFS:")
    graph.bfs(1)
