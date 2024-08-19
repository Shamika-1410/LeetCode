class Solution {
    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;int k=0;
        Set<Integer> rowSet = new LinkedHashSet<>();
        Set<Integer> colSet = new LinkedHashSet<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0){
                    if(!rowSet.contains(i)){
                        rowSet.add(i);
                    }
                    if(!colSet.contains(j)){
                        colSet.add(j);
                    }
                }
            } 
        }
        for(Integer row : rowSet){
            for(int j=0;j<c;j++){
                matrix[row][j]=0;
            }
        }
        for(Integer col : colSet){
            for(int i=0;i<r;i++){
                matrix[i][col]=0;
            }
        }
    }
}