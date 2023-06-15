class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        int[][] trans=new int[grid.length][grid.length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                trans[i][j]=grid[j][i];
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                 if(Arrays.equals(grid[i],trans[j])){
                     count++;
                 }
            }
        }
        return count;
    }
}