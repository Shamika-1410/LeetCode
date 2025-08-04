class Solution {
    public int findCircleNum(int[][] isConnected) {
        Main obj = new Main(isConnected.length);
        int n = isConnected.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1){
                    obj.addEdge(i,j);
                }
            }
        }
        int count = 0;
        for(int i=0;i<n;i++){
            if(!obj.visited[i]){
                obj.dfs(i);
                count++;
            }
        }
        return count;
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
            list.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int v, int w){
        list.get(v).add(w);
        list.get(w).add(v);
    }
    void dfs(int start){
        visited[start]=true;
        for(int neighbour : list.get(start)){
            if(!visited[neighbour]){
                this.dfs(neighbour);
            }
        }
    }
}
