class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[10];
        for(int digit : digits){
            freq[digit]++;
        }
        for(int i=1;i<=9;i++){
            if(freq[i]==0)continue;
            freq[i]--;
            for(int j=0;j<=9;j++){
                if(freq[j]==0)continue;
                freq[j]--;
                for(int k=0;k<=8;k+=2){
                    if(freq[k]==0)continue;
                    freq[k]--;

                    int num = i*100+j*10+k;
                    list.add(num);

                    freq[k]++;
                }
                freq[j]++;
            }
            freq[i]++; 
        }
        Collections.sort(list);
        int n = list.size();
        int[] resArr = new int[n];
        for (int i = 0; i < n; i++) {
            resArr[i] = list.get(i);
        }
        return resArr;
    }
}