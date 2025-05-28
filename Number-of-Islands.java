class Solution {
    public static int[][] dic= {{-1,0},{0,-1},{1,0},{0,1}};
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        int num=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                dfs(i,j,m,n,grid);
                num++;
                }
            }
        } 
        return num;         
    }

    private boolean isValid(int i,int j,int m,int n){
        if(i==-1 || j ==-1 || i==m || j==n){
            return false;
        }
        return true;
    }

    private void dfs(int i,int j,int m,int n,char[][] grid){
        if(!isValid(i,j,m,n) || grid[i][j]=='0'){
            return;
        }

        grid[i][j]='0';

        for(int[] d:dic){
            int ni=i+d[0];
            int nj=j+d[1];
            dfs(ni,nj,m,n,grid);
        }
    }
}
