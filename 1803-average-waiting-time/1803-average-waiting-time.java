class Solution {
    public double averageWaitingTime(int[][] customers) {
        int n = customers.length;
        int currentTime = 0;
        double waitingTime = 0;
        for(int i=0;i<n;i++){
            int arrival = customers[i][0];
            int time = customers[i][1];
            if(currentTime<=arrival){
                waitingTime += (arrival + time) - arrival;
                currentTime = arrival + time;
            }else{
                waitingTime += (currentTime +time) - arrival;
                currentTime+=time;
            }
        }
        return waitingTime/n;
    }
}