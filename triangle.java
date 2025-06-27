class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        
        int n = triangle.size();
        int [][] dp =  new int [n][n];
        for(int [] i: dp) Arrays.fill(i,-1);
        return solve (0,0,n,triangle,dp);
    }
    int solve(int i, int j,int n, List<List<Integer>> triangle,int [][] dp){

        if(i>=n||j>=n) return (int)(1e9);

        if(i==n-1) return triangle.get(i).get(j);

        if(dp[i][j]!=-1) return dp[i][j];

        int down = triangle.get(i).get(j)+ solve(i+1,j,n,triangle,dp);
        int diagonal = triangle.get(i).get(j)+ solve(i+1,j+1,n,triangle,dp);

        return dp[i][j] = Math.min(down,diagonal);
    }
}
