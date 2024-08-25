package Graphs;
import java.util.*;
public class AdjacencyListArray {
    private List<Integer>[][] adjacencyListArray;
    private int vertices;
    public AdjacencyListArray(int vertices) {
        this.vertices = vertices;
        this.adjacencyListArray = new ArrayList[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                adjacencyListArray[i][j] = new ArrayList<>();
            }
        }
    }
    public void addEdge(int source, int destination) {
        validateVertices(source, destination);
        adjacencyListArray[source][destination].add(destination);
    }
    public void removeEdge(int source, int destination) {
        validateVertices(source, destination);
        if (! adjacencyListArray[source][destination].contains(destination)) {
            throw new IllegalArgumentException("Destination Entered Is Not A Part of the Source.");
        }
        adjacencyListArray[source][destination].remove(Integer.valueOf(destination));
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " --> ");
            for (int j = 0; j < vertices; j++) {
                if (! adjacencyListArray[i][j].isEmpty()) {
                    for (int neighbor : adjacencyListArray[i][j]) {
                        System.out.print(neighbor + " ");
                    }
                }
            }
            System.out.println();
        }
    }
    public List<Integer> getNeighbors(int vertex) {
        validateVertex(vertex);
        List<Integer> neighbors = new ArrayList<>();
        for (int j = 0; j < vertices; j++) {
            neighbors.addAll(adjacencyListArray[vertex][j]);
        }
        return neighbors;
    }
    private void validateVertices(int source, int destination) {
        validateVertex(source);
        validateVertex(destination);
    }
    private void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= vertices) {
            throw new IllegalArgumentException("Invalid Argument Exception");
        }
    }
}