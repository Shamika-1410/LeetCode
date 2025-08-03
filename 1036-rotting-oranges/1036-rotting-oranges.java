class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int n = grid.length;
        int m = grid[0].length;
        int[][] visited = grid;
        int numRotten=0,numFresh=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2)queue.offer(new int[] {i,j});
                else if(grid[i][j]==1)numFresh++;
            }
        }
        if(numFresh==0)return 0;
        if(queue.isEmpty())return -1;
        int minutes = -1;
        int[][] dirs = {{1,0},{-1,0},{0,-1},{0,1}};
        while(!queue.isEmpty()){
            int N = queue.size();
            while(N-->0){
                int[] a = queue.poll();
                int r = a[0],c = a[1];
                for(int[] dir: dirs){
                    int x = r + dir[0];
                    int y = c + dir[1];
                    if(x>=0 && y>=0 && x<n && y<m && visited[x][y]==1){
                        visited[x][y]=2;
                        numFresh--;
                        queue.offer(new int[] {x,y});
                    }
                }
            }
            minutes++;
        }
        if(numFresh==0){
            return minutes;
        }
        return -1;
    }
}