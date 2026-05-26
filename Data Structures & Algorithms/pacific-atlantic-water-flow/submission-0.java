class Solution {

    public void dfs(int row, int col, int heights[][], boolean[][] ocean)
    {
        int n = heights.length;
        int m = heights[0].length;

        ocean[row][col]=true;

        int horizontal[]={0,-1,0,1};
        int vertical[]={-1,0,1,0};

        for(int i=0;i<4;i++)
        {
            int n_row = horizontal[i]+row;
            int n_col = vertical[i]+col;

            if(n_row>=0&&n_row<n&&n_col>=0&&n_col<m&&!ocean[n_row][n_col]&&
            heights[n_row][n_col]>=heights[row][col])
            {
                dfs(n_row,n_col,heights,ocean);
            }
        }

        return;
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        
        List<List<Integer>> ans = new ArrayList<>();

        int n = heights.length;
        int m = heights[0].length;

        boolean pacific[][]=new boolean[n][m];
        boolean atlantic[][]=new boolean[n][m];

        for(int i=0;i<m;i++)
        {
            dfs(0,i,heights,pacific);
            dfs(n-1,i,heights,atlantic);
        }

        for(int i=0;i<n;i++)
        {
            dfs(i,0,heights,pacific);
            dfs(i,m-1,heights,atlantic);
        }

        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<m;j++)
            {
                
                if(pacific[i][j]&&atlantic[i][j])
                {
                    ans.add(Arrays.asList(i,j));
                }
                
            }
            
        }

        return ans;

    }
}
