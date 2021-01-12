package fuckingQuery;

import java.util.Queue;

public class islandNums {
    public int numsIsland(char[][] grid){
        int num=0;
        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    private void dfs(char[][] grid,int i,int j){
        if (i<0||j<0||i>=grid.length||j>=grid[0].length||grid[i][j]=='0')
            return;
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }

    public void test(){
        char[][] gird= {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0},{1, 1, 0, 0, 0},{0, 0, 0, 0, 0}};
        int count=numsIsland(gird);
        System.out.println(count);
    }
}
