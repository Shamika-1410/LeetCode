class Solution {
    public boolean isHappy(int n) {
        if(n==1 || n==7)return true;
        else if(n<10)return false;
        else{
            int temp = n;
            n = 0;
            while(temp>0){
                int digit = temp%10;
                n += digit*digit;
                temp/=10;
            }
            return isHappy(n);
        }
    }
}