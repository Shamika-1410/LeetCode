class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sumA = 0;
        int sumB = 0;
        int n = gas.length;
        for(int i=0;i<n;i++){
            sumA += gas[i];
            sumB += cost[i];
        }
        if(sumA<sumB) return -1;
        int tank = 0,index = 0;
        for(int i=0;i<n;i++){
            tank += gas[i]-cost[i];
            if(tank<0){
                tank = 0;
                index = i+1;
            }
        }
        return index;
    }
}