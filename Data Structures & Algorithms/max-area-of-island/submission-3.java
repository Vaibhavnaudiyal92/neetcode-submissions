class Solution {

    int area = 0;
    public int dfs(int[][]grid, int row, int col, int[][]vis, int n, int m)
    {
        vis[row][col]=1;

        int horizontal[]={0,-1,0,1};
        int vertical[]={-1,0,1,0};
        int count=1;
        for(int i=0;i<4;i++)
        {
            int n_row = horizontal[i]+row;
            int n_col = vertical[i]+col;

            if(n_row>=0&&n_row<n&&n_col>=0&&n_col<m&&grid[n_row][n_col]==1&&vis[n_row][n_col]==0)
            {
                count=count+dfs(grid,n_row,n_col,vis,n,m);
            }
        }
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;

        int vis[][]=new int[n][m];
        int maxArea = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==1&&vis[i][j]==0)
                {
                    int area = dfs(grid,i,j,vis,n,m);
                    maxArea = Math.max(maxArea,area);
                }
            }
        }

        return maxArea;
    }
}
