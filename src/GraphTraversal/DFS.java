package GraphTraversal;
import java.util.*;
public class DFS {
    private int vertices;
    private LinkedList<Integer> adjList[];
    public DFS(int vertices) {
        this.vertices = vertices;
        this.adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }
    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }
    public void dFSTraversal(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dFSRecursive(startVertex, visited);
    }
    private void dFSRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.println(vertex);

        for (int neighbor : adjList[vertex]) {
            if (!visited[neighbor]) {
                dFSRecursive(neighbor, visited);
            }
        }
    }
}