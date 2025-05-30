class Solution {
    public int orangesRotting(int[][] grid) {
       Queue<Pair<Integer,Integer>> q = new LinkedList<>();
        int m=grid.length;
        int n=grid[0].length;
        int time=-1;
        int[][] dic={{1,0},{0,1},{-1,0},{0,-1}};
        int freshOrangeCount=0;

       for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(grid[i][j]==2){
                q.add(new Pair(i,j));
            }
            if(grid[i][j]==1){
                freshOrangeCount++;
            }
        }
       } 

       if(q.isEmpty()){
        if(freshOrangeCount>0){
        return -1;
       }
        return 0;
       }

        while(!q.isEmpty()){
            int size=q.size();
            time++;
            while(size>0){
                Pair<Integer,Integer> curr=q.poll();
                System.out.println(curr);
                int i=curr.getKey();
                int j=curr.getValue();
                for(int[] d:dic){
                    int ni=i+d[0];
                    int nj=j+d[1];
                    if(isValid(ni,nj,m,n) && grid[ni][nj]==1){
                        grid[ni][nj]=2;
                        q.add(new Pair(ni,nj));
                        freshOrangeCount--;
                    }
                }
                size--;
            }
        }

       if(freshOrangeCount>0){
        return -1;
       }

       return time;
    }

    private boolean isValid(int i,int j,int m,int n){
        if(i==-1||j==-1||i==m||j==n){
            return false;
        }
        return true;
    }
}