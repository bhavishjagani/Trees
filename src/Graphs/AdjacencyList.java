package Graphs;
import java.util.*;
public class AdjacencyList {
    private Map<Integer, List<Integer>> lists;
    private int vertices;
    public AdjacencyList(int vertices) {
        this.vertices = vertices;
        this.lists = new HashMap<>();
        for (int i = 0; i < vertices; i++) {
            lists.put(i, new ArrayList<>());
        }
    }
    public void addEdge(int source, int destination) {
        validateVertices(source, destination);
        lists.get(source).add(destination);
    }
    public void removeEdge(int source, int destination) {
        validateVertices(source, destination);
        lists.get(source).remove(destination);
    }
    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " --> ");
            for (int j : lists.get(i)) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public List<Integer> getNeighbors(int vertex) {
        validateVertex(vertex);
        return lists.getOrDefault(vertex, new ArrayList<>());
    }
    public void validateVertices(int source, int destination) {
        validateVertex(source);
        validateVertex(destination);
    }
    public void validateVertex(int vertex) {
        if (vertex < 0 || vertex >= vertices){
            throw new IllegalArgumentException("Invalid Argument Exception");
        }
    }
}