class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=n*(n+1)/2,num2=0;
        int num = m;
        for(int i=2;num<=n;i++){
            num1-=num;
            num2+=num;
            num=i*m;
        }
        return num1-num2;
    }
}