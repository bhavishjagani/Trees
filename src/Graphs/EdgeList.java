package Graphs;
import java.util.*;
public class EdgeList {
    private int vertices;
    private Set<Edge> edges;

    public EdgeList() {
        this.edges = new HashSet<>();
    }
    public static class Edge {
        private int source;
        private int destination;

        public Edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
        @Override
        public String toString() {
            return "(" + source + " -> " + destination + ")";
        }
    }
    public void addEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        edges.add(edge);
    }

    public void removeEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        if (! edges.remove(edge)) {
            throw new IllegalArgumentException("Edge does not exist.");
        }
    }
    public boolean hasEdge(int source, int destination) {
        Edge edge = new Edge(source, destination);
        return edges.contains(edge);
    }
    public void printGraph() {
        if (edges.isEmpty()) {
            System.out.println("The graph is empty.");
        }
        else {
            for (Edge edge : edges) {
                System.out.println(edge);
            }
        }
    }
    public Set<Edge> getEdges() {
        return edges;
    }
    private void validateVertices(int source, int destination) {
        if (source < 0 || destination < 0 || source >= vertices || destination >= vertices) {
            throw new IllegalArgumentException("Invalid vertices: source = " + source + ", destination = " + destination);
        }
    }
}
//addEdge, removeEdge, printGraph, hasEdge, getEdges (to print all edges)