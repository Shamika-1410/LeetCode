class Solution {
    public void solve(char[][] board) {
        int m = board.length;        // rows
        int n = board[0].length;     // cols
        boolean[][] visited = new boolean[m][n];

        // Left and right borders
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O' && !visited[i][0]) dfs1(board, m, n, i, 0, visited);
            if (board[i][n - 1] == 'O' && !visited[i][n - 1]) dfs1(board, m, n, i, n - 1, visited);
        }

        // Top and bottom borders
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O' && !visited[0][j]) dfs1(board, m, n, 0, j, visited);
            if (board[m - 1][j] == 'O' && !visited[m - 1][j]) dfs1(board, m, n, m - 1, j, visited);
        }

        // Convert unvisited 'O' to 'X'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    dfs2(board, m, n, i, j, visited);
                }
            }
        }
    }

    void dfs1(char[][] board, int m, int n, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= m || y >= n) return;
        if (board[x][y] != 'O' || visited[x][y]) return;

        visited[x][y] = true;
        dfs1(board, m, n, x + 1, y, visited);
        dfs1(board, m, n, x, y + 1, visited);
        dfs1(board, m, n, x - 1, y, visited);
        dfs1(board, m, n, x, y - 1, visited);
    }

    void dfs2(char[][] board, int m, int n, int x, int y, boolean[][] visited) {
        if (x < 0 || y < 0 || x >= m || y >= n) return;
        if (board[x][y] != 'O' || visited[x][y]) return;

        board[x][y] = 'X';
        visited[x][y] = true;
        dfs2(board, m, n, x + 1, y, visited);
        dfs2(board, m, n, x, y + 1, visited);
        dfs2(board, m, n, x - 1, y, visited);
        dfs2(board, m, n, x, y - 1, visited);
    }
}
