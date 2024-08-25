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
    }
}
//addEdge, removeEdge, printGraph, hasEdge, getEdges (to print all edges)