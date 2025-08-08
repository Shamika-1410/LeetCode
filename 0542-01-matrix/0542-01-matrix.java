class Solution {
    public static int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0)queue.offer(new int[]{i,j});
                else mat[i][j]=-1;
            }
        }
        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!queue.isEmpty()){
            int[] cell = queue.poll();
            for(int[] dir : dirs){
                int x = cell[0] + dir[0];
                int y = cell[1] + dir[1];
                if(x<0 || y<0 || x==n || y==m || mat[x][y]!=-1){
                    continue;
                }
                mat[x][y] = mat[cell[0]][cell[1]]+1;
                queue.offer(new int[]{x,y});
            }
        }
        return mat;
    }
}