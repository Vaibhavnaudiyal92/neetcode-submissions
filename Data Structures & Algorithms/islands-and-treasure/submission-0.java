class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        Queue<int[]> q = new LinkedList<>();

        int n=grid.length;
        int m=grid[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==0)
                {
                    q.add(new int[] {i,j});
                }
            }
        }

        if(q.size()==0)
        {
            return;
        }
        int horizontal[]={0,-1,0,1};
        int vertical[]={-1,0,1,0};

        while(!q.isEmpty())
        {
            int[]node = q.poll();

            int row = node[0];
            int col = node[1];

            for(int i=0;i<4;i++)
            {
                int n_row=horizontal[i]+row;
                int n_col=vertical[i]+col;

                if(n_row<n&&n_row>=0&&n_col<m&&n_col>=0&&grid[n_row][n_col]==Integer.MAX_VALUE)
                {
                    q.add(new int[]{n_row, n_col});
                    grid[n_row][n_col]=grid[row][col]+1;
                }
                else
                {
                    continue;
                }
            }
        }

    }
}
