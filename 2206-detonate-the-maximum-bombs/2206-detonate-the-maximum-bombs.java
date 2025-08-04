class Solution {
    public int maximumDetonation(int[][] bombs) {
        int n = bombs.length;
        Main m = new Main(n);
        for(int i=0;i<n;i++){
            long xi = bombs[i][0], yi = bombs[i][1], ri = bombs[i][2];
            for(int j=0;j<n;j++){
                if(i==j)continue;
                long xj = bombs[j][0], yj = bombs[j][1];
                long dx = xi - xj;
                long dy = yi - yj;
                if(dx*dx + dy*dy <= ri*ri){
                    m.addEdge(i,j);
                }
            }
        }
        return m.largestComponentSize();
    }
}
class Main{
    int V;
    boolean[] visited;
    List<List<Integer>> list;
    Main(int V){
        this.V = V;
        visited = new boolean[V];
        list = new ArrayList<>();
        for(int i=0;i<V;i++){
            list.add(new ArrayList<>());
        }
    }
    void addEdge(int v, int w){
        list.get(v).add(w);
        //list.get(w).add(v);
    }
    int dfs(int start){
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;
        int size = 0;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            size++;
            for (int neighbour : list.get(node)) {
                if (!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;
                }
            }
        }
        return size;
    }
    int largestComponentSize(){
        int maxSize = 0;
        for(int i=0;i<V;i++){
            visited = new boolean[V];
            if(!this.visited[i]){
                int size = dfs(i);
                maxSize = Math.max(maxSize, size);
            }
        }
        return maxSize;
    }
}