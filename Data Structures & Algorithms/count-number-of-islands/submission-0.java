class Solution {

    public void dfs(char[][]grid, int row, int col, int[][]vis, int n, int m)
    {
        vis[row][col]=1;

        int horizontal[]={0,-1,0,1};
        int vertical[]={-1,0,1,0};

        for(int i=0;i<4;i++)
        {
            int n_row = row+horizontal[i];
            int n_col = col+vertical[i];

            if(n_row>=0&&n_row<n&&n_col>=0&&n_col<m&&grid[n_row][n_col]=='1'&&vis[n_row][n_col]==0)
            {
                dfs(grid,n_row,n_col,vis,n,m);
            }

        }

        return;
    }
    public int numIslands(char[][] grid) {
        
        int n=grid.length;
        int m=grid[0].length;

        int vis[][]=new int[n][m];
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]=='1'&&vis[i][j]==0)
                {
                    count++;
                    dfs(grid,i,j,vis,n,m);
                }
            }
        }

        return count;
    }
}
