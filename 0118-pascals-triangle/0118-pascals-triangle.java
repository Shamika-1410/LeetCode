class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        ans.add(list1);
        if(numRows==1)return ans;
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(1);
        ans.add(list2);
        if(numRows==2)return ans;
        for(int i=2;i<numRows;i++){
            List<Integer> list3 = new ArrayList<>();
            list3.add(1);
            List<Integer> prevList = ans.get(i-1);
            for(int j=1;j<=i-1;j++){
                int a = prevList.get(j);
                int b = prevList.get(j-1);
                list3.add(a+b);
            }
            list3.add(1);
            ans.add(list3);
        }
        return ans;
    }
}