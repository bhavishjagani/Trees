package ShortestPathAlgorithm;
import java.util.Arrays;
public class ShortestPathAlgorithmMain {
    public static void main (String[] args) {
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[][] graph = {
                         {2, 4, 2},
                         {1, 0, -11},
                         {1, 2, 4},
                         {0, 1, 6}
        };
        //System.out.println((Arrays.toString(dijkstraAlgorithm.dijkstra(graph, 3))));
        BellmanFordAlgorithm.bellmanFord(graph, 0, 4, 5);
    }
}