package ShortestPathAlgorithm;
import java.util.Arrays;
public class ShortestPathAlgorithmMain {
    public static void main (String[] args) {
        DijkstraAlgorithm dijkstraAlgorithm = new DijkstraAlgorithm();
        int[][] graph = {
                         {0, 3, 4, 2},
                         {1, 5, 11, 0},
                         {1, 2, 4, 1},
                         {8, 3, 6, 0}
        };
        System.out.println((Arrays.toString(dijkstraAlgorithm.dijkstra(graph, 3))));
    }
}

//Finish Main, Do Leetcode Problems in Preply, Push DijkstraAlgorithm + Main