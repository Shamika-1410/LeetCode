class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph, 0, graph.length - 1, path, result);
        return result;
    }
    private void dfs(int[][] graph, int curr, int target, List<Integer> path, List<List<Integer>> result) {
        if (curr == target) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int next : graph[curr]) {
            path.add(next);
            dfs(graph, next, target, path, result);
            path.remove(path.size() - 1);
        }
    }
}