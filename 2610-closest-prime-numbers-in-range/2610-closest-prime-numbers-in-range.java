class Solution {
    public int[] closestPrimes(int left, int right) {
        int sieveArray[] = sieve(right);
        List<Integer> prime = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(sieveArray[i]==1){
                prime.add(i);
            }
        }
        if(prime.size()<2) return new int[] {-1,-1};
        int min = Integer.MAX_VALUE;
        int closestPair[] = new int[2];
        Arrays.fill(closestPair,-1);
        for(int i=1;i<prime.size();i++){
            int diff = prime.get(i)-prime.get(i-1);
            if(diff<min){
                min=diff;
                closestPair[0]=prime.get(i-1);
                closestPair[1]=prime.get(i);
            }
        }
        return closestPair;
    }
    private int[] sieve(int up){
        int sieve[] = new int[up+1];
        Arrays.fill(sieve,1);
        sieve[0]=0;
        sieve[1]=0;
        for(int i=2;i*i<=up;i++){
            if(sieve[i]==1){
                for(int mul=i*i;mul<=up;mul+=i){
                    sieve[mul]=0;
                }
            }
        }
        return sieve;
    }
}