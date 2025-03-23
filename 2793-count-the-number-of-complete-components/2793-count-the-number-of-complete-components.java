public class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        // Adjacency lists for each vertex
        List<Integer>[] graph = new ArrayList[n];
        // Map to store frequency of each unique adjacency list
        Map<List<Integer>, Integer> componentFreq = new HashMap<>();
        // Initialize adjacency lists with self-loops
        for (int vertex = 0; vertex < n; vertex++) {
            graph[vertex] = new ArrayList<>();
            graph[vertex].add(vertex);
        }
        // Build adjacency lists from edges
        for (int[] edge : edges) {
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        // Count frequency of each unique adjacency pattern
        for (int vertex = 0; vertex < n; vertex++) {
            List<Integer> neighbors = graph[vertex];
            Collections.sort(neighbors);
            componentFreq.put(
                neighbors,
                componentFreq.getOrDefault(neighbors, 0) + 1
            );
        }
        // Count complete components where size equals frequency
        int completeCount = 0;
        for (Map.Entry<
            List<Integer>,
            Integer
        > entry : componentFreq.entrySet()) {
            if (entry.getKey().size() == entry.getValue()) {
                completeCount++;
            }
        }

        return completeCount;
    }
}