class Solution {
    public int findTheWinner(int n, int k) {
        int deleted[] = new int[n];
        int peopleRemaining = n;
        int i=0;
        while(peopleRemaining>1){
            int j=i,count=0;
            while(count!=k){
                if(deleted[j]==0) count++;
                if(j>=n-1) j=0;
                else j++;
            }
            if(j==0) i=n-1;
            else i=j-1;
            deleted[i]=1;
            peopleRemaining--;
            if(i>=n-1) i=0;
            else i++;
        }
        int ans = getAns(deleted);
        return ans;
    }
    public int getAns(int[] d){
        int ans=0;
        for(int i = 0;i<d.length;i++){
            if(d[i]==0){
                ans=i+1;
                break;
            }
        }
        return ans;
    }
}