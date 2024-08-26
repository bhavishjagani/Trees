package GraphTraversal;
public class GraphTraversalMain {
    public static void main (String[] args) {
        BFS bfs = new BFS(7);
        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(3, 4);
        bfs.addEdge(3, 5);
        bfs.addEdge(4, 5);
        bfs.addEdge(5, 6);

        bfs.bFSTraversal(3);

        System.out.println(bfs);
    }
}
//Implement DFS (Depth First Search)
//Find Two Problems, Leetcode, BFS