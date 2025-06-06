class Solution {
    class UnionFind{
        int parent[];
        UnionFind(int n){
            parent = new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
            }
        }
        int find(int x){
            if(parent[x] == x){
                return x;
            }
            parent[x]=find(parent[x]);
            return parent[x];
        }
        void union(int x,int y){
            int rootx = find(x);
            int rooty = find(y);
            if(rootx != rooty){
                if(rootx < rooty){
                    parent[rooty] = rootx;
                }else{
                    parent[rootx] = rooty;
                }
            }
        }     
    }
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        UnionFind uf = new UnionFind(26);
        int n = s1.length();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            uf.union(s1.charAt(i)-'a',s2.charAt(i)-'a');
        }
        for(char c : baseStr.toCharArray()){
            sb.append((char)(uf.find(c-'a')+'a'));
        }
        return sb.toString();
    }
}