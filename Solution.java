class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Comparator<int[]> result = (a,b) -> Math.abs(b[0]-b[1]) - Math.abs(a[0]-a[1]);
        Arrays.sort(costs, result);
        int n = costs.length/2, c1 = 0, c2 = 0, ans = 0, i=0;
        while(i<2*n){
            if((costs[i][0] <= costs[i][1] && c1<n) || c2 ==n ){
                ans += costs[i++][0];
                c1++;
            }else{
                ans += costs[i++][1];
                c2++;
            }                
            
        }
        return ans;
        
    }
}
