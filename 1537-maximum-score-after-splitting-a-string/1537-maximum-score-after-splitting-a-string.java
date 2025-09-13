class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zeros = new int[n];
        int[] ones = new int[n];
        zeros[0] = s.charAt(0)=='0'?1:0;
        ones[n-1] = s.charAt(n-1)=='1'?1:0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)=='0'){
                zeros[i] = zeros[i-1] + 1;
            }else{
                zeros[i] = zeros[i-1];
            }
        }
        for(int i=n-2;i>=0;i--){
            if(s.charAt(i)=='1'){
                ones[i] = ones[i+1] + 1;
            }else{
                ones[i] = ones[i+1];
            }
        }
        System.out.println(Arrays.toString(zeros));
        System.out.println(Arrays.toString(ones));
        int max = 0;
        int i=0,j=1;
        while(i<n && j<n){
            max = Math.max(max, zeros[i]+ones[j]);
            i++;
            j++;
        }
        return max;
    }
}