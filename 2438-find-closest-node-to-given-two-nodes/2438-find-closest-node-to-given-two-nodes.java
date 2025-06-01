class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] d1 = new int[n];
        int[] d2 = new int[n];
        Arrays.fill(d1,Integer.MAX_VALUE);
        Arrays.fill(d2,Integer.MAX_VALUE);
        bfs(node1,edges,d1);
        bfs(node2,edges,d2);
        int min = -1,minDist = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(minDist > Math.max(d1[i],d2[i])){
                min = i;
                minDist = Math.max(d1[i],d2[i]);
            }
        }
        return min;
    }
    public static void bfs(int start,int[] edges,int[] d){
        int n = edges.length;
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        boolean[] v = new boolean[n];
        d[start]=0;
        while(!q.isEmpty()){
            int node = q.poll();
            if(!v[node]){
                v[node]=true;
                int neigh = edges[node];
                if(neigh != -1 && !v[neigh]){
                    d[neigh]=1+d[node];
                    q.offer(neigh);
                }
            }
        }
    }
}