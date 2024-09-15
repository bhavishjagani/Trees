package ShortestPathAlgorithm;
import java.util.Arrays;
public class BellmanFordAlgorithm {
    public static void bellmanFord(int[][] graph, int source, int edges, int vert) {
        int[] dist = new int[vert];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;
        for (int i = 0; i < vert-1; i++) {
            for (int j = 0; j < edges; j++) {
                int u = graph[j][0];
                int v = graph[j][1];
                int w = graph[j][2];
                if (dist[u] != Integer.MAX_VALUE && (dist[u] + w < dist[v])) {
                    dist[v] = dist[u] + w;
                }
            }
        }
        for (int i = 0; i < vert-1; i++) {
            int u = graph[i][0];
            int v = graph[i][1];
            int w = graph[i][2];
            if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                System.out.println("Graph Contains Negative Weight Cycle");
                return;
            }
        }
        System.out.println(Arrays.toString(dist));
    }
}