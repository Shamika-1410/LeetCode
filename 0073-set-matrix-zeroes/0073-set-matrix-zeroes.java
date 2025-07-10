class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rows = new HashSet<>();
        Set<Integer> cols = new HashSet<>();
        int r = matrix.length;
        int c = matrix[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int row : rows){
            for(int j=0;j<c;j++){
                matrix[row][j]=0;
            }
        }
        for(int col : cols){
            for(int i=0;i<r;i++){
                matrix[i][col]=0;
            }
        }
    }
}