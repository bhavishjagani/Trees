package ShortestPathAlgorithm;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
public class DijkstraAlgorithm {
    public int[] dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] dist = new int[n];
        boolean[]
                visited = new boolean[n];

        Arrays.fill(dist, Integer.MAX_VALUE);
        if (n > 0) {
            dist[source] = 0;
        }

        PriorityQueue <int[]> pQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pQ.offer(new int[] {source, 0});

        while (!pQ.isEmpty()) {
            int[] current = pQ.poll();
            int v = current[0];
            int vDist = current[1];

            if (visited[v]) {
                continue;
            }

            visited[v] = true;
            for (int i = 0; i < n; i++) {
                int weight = graph[v][i];
                if (weight > 0 && ! visited[i]) {
                    int newDist = vDist + weight;
                    if (newDist < dist[i]) {
                        dist[i] = newDist;
                        pQ.offer(new int[] {i, newDist});
                    }
                }
            }
        }
        return dist;
    }
}