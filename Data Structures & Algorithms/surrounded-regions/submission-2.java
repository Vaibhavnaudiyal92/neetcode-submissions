class Solution {

    public void dfs(char[][] board, int row, int col)
    {
        int n=board.length;
        int m=board[0].length;

        if(row<0 || row>=n || col<0 || col>=m || board[row][col]!='O')
        {
            return;
        }

        board[row][col]='T';
        dfs(board,row-1,col);
        dfs(board,row, col-1);
        dfs(board, row+1, col);
        dfs(board, row, col+1);
    }
    public void solve(char[][] board) {
        
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<n;i++)
        {
            if(board[i][0]=='O')
            {
                dfs(board, i, 0);
            }
            if(board[i][m-1]=='O')
            {
                dfs(board, i, m-1);
            }
        }

        for(int i=0;i<m;i++)
        {
            if(board[0][i]=='O')
            {
                dfs(board, 0, i);
            }
            if(board[n-1][i]=='O')
            {
                dfs(board, n-1, i);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]=='O')
                {
                    board[i][j]='X';
                }
                else if(board[i][j]=='T')
                {
                    board[i][j]='O';
                }
            }
        }

        return;
    }
}
