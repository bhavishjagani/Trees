package Graphs;
import java.util.Arrays;
public class GraphMain {
    public static void main (String[] args) {
        AdjacencyList adjacencyList = new AdjacencyList(4);
        adjacencyList.addEdge(0, 1);
        adjacencyList.addEdge(0, 2);
        adjacencyList.addEdge(1, 3);
        //adjacencyList.printGraph();
        //System.out.println(adjacencyList.getNeighbors(0));
        //adjacencyList.removeEdge(2, 4);
        //adjacencyList.printGraph();

        //Adjacency Matrix
        AdjacencyMatrix adjacencyMatrix = new AdjacencyMatrix(5);
        adjacencyMatrix.addEdge(0, 1);
        adjacencyMatrix.addEdge(1, 0);
        adjacencyMatrix.addEdge(0, 2);
        adjacencyMatrix.addEdge(2, 0);
        adjacencyMatrix.addEdge(0, 3);
        adjacencyMatrix.addEdge(3, 0);
        adjacencyMatrix.addEdge(3, 1);
        adjacencyMatrix.addEdge(1, 3);
        adjacencyMatrix.addEdge(3, 2);
        adjacencyMatrix.addEdge(2, 3);
        adjacencyMatrix.addEdge(4, 1);
        adjacencyMatrix.addEdge(1, 4);
        adjacencyMatrix.addEdge(4, 3);
        adjacencyMatrix.addEdge(3, 4);
        adjacencyMatrix.addEdge(3, 3);
        adjacencyMatrix.printGraph();
        //System.out.println();
        //System.out.println(Arrays.toString(adjacencyMatrix.getNeighbors(0)));
        adjacencyMatrix.removeEdge(3,3);
        adjacencyMatrix.removeEdge(0,1);
        System.out.println();
        adjacencyMatrix.printGraph();
    }
}
//Homework: Do Adjacency List with 2D Array
//Homework: Do Adjacency List + weight