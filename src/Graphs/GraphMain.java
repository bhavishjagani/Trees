package Graphs;
public class GraphMain {
    public static void main (String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList(4);
        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(1, 3);
        adjacencyList.printGraph();
        System.out.println(adjacencyList.getNeighbors(0));
    }
}
//Adjacency Matrix, Adjacency List 2d Array