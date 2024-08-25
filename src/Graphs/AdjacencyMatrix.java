package Graphs;
import java.util.Arrays;
public class AdjacencyMatrix {
    private int[][] matrix;
    private int vertices;
    public AdjacencyMatrix(int vertices) {
        this.vertices = vertices;
        this.matrix = new int[vertices][vertices];
    }
    public void addEdge(int source, int destination) {
        validateVertices(source, destination);
        matrix[source][destination] = 1;
    }
    public void removeEdge(int source, int destination) {
        validateVertices(source, destination);
        matrix[source][destination] = 0;
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
//    public int[] getNeighbors(int vertex) {
//        validateVertex(vertex);
//        return matrix[vertex];
//    }
    public void validateVertices(int source, int destination) {
        validateVertex(source);
        validateVertex(destination);
    }
    public void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= vertices) {
            throw new IllegalArgumentException("Invalid Argument Exception");
        }
    }
}