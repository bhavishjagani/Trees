package GraphTraversal;
import java.util.*;
public class BFS {
    private int vertices;
    private LinkedList<Integer> adjList [];
    public BFS (int vertices) {
        this.vertices = vertices;
        this.adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }
    public void bFSTraversal(int startVertex) {
        LinkedList<Integer> queue = new LinkedList<>();
        boolean visited[] = new boolean[vertices];

        visited[startVertex] = true;

        queue.add(startVertex);

        while (! queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.println(vertex);

            for (int neighbor : adjList[vertex]) {
                if (! visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }
}
//Implement DFS (Depth First Search)
//Find Two Problems, Leetcode, BFS