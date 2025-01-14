class Solution {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] ans = new int[n];
        int[] freq = new int[n+1];
        int a = 0;
        for(int i=0;i<n;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2) ++a;
            freq[B[i]]++;
            if(freq[B[i]]==2) ++a;
            ans[i]=a;
        }
        return ans;
    }
}