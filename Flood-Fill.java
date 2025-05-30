class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int currentColor=image[sr][sc];
        int[][] dic={{1,0},{0,1},{-1,0},{0,-1}};

        if(currentColor!=color){
        dfs(image, sr, sc, color,dic,currentColor);
        }

        return image;
    }

    private boolean isValid(int sr,int sc,int[][] image){
        if(sr==-1 || sc==-1 || sr==image.length || sc==image[0].length){
            return false;
        }
        return true;
    }

    private void dfs(int[][] image, int sr, int sc, int color,int[][] dic,int currentColor){
        if(!isValid(sr,sc,image) || image[sr][sc]!=currentColor){
            return;
        }

        image[sr][sc]=color;

        for(int[] d:dic){
            int n_sr=sr+d[0];
            int n_sc=sc+d[1];
            dfs(image, n_sr, n_sc, color,dic,currentColor);
        }
        return;
    }
}
