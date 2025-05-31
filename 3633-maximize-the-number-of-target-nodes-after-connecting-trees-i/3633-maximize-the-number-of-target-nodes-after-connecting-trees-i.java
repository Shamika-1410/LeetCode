class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = 0;
        for(int[] e : edges1){
            n = Math.max(n, Math.max(e[0],e[1]));
        }
        n++;
        int m = 0;
        for(int[] e : edges2){
            m = Math.max(m, Math.max(e[0],e[1]));
        }
        m++;
        List<List<Integer>> list1 = new ArrayList<>();
        for(int i=0;i<n;i++){
            list1.add(new ArrayList<>());
        }
        List<List<Integer>> list2 = new ArrayList<>();
        for(int i=0;i<m;i++){
            list2.add(new ArrayList<>());
        }
        for(int[] e: edges1){
            list1.get(e[0]).add(e[1]);
            list1.get(e[1]).add(e[0]);
        }
        for(int[] e: edges2){
            list2.get(e[0]).add(e[1]);
            list2.get(e[1]).add(e[0]);
        }
        int[] path = new int[n];
        for (int i = 0; i < n; i++) {
            path[i]=bfs(i, list1, k);
        }
        int maxFound = 0;
        if (k > 0) {
            for (int i = 0; i < m; i++) {
                int count = bfs(i, list2, k - 1);
                maxFound = Math.max(maxFound, count);
            }
        }

        for (int i = 0; i < n; i++) {
            path[i]= path[i] + maxFound;
        }
        return path;
    }
    public int bfs(int start, List<List<Integer>> list,int k){
        if(k==0) return 1;
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited.add(start);
        int level=0,nodes=1;
        while(!q.isEmpty() && level<k){
            int size = q.size();
            for(int i=0;i<size;i++){
                int node = q.poll();
                for(int neigh : list.get(node)){
                    if(!visited.contains(neigh)){
                        visited.add(neigh);
                        q.add(neigh);
                        nodes++;
                    }
                }
            }
            level++;
        }
        return nodes;
    }
}