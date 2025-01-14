import java.util.*;
class Solution {
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        int n = A.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            setA.add(A[i]);
            setB.add(B[i]);
            ans[i]=common(setA,setB);
        }
        return ans;
    }
    public static int common(Set<Integer> setA,Set<Integer> setB){
        int a = 0;
        for(Integer i : setA){
            if(setB.contains(i)) a++;
        }
        return a;
    }
}