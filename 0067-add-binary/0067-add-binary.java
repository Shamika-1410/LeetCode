class Solution {
    public static String addBinary(String a, String b) {
        char c = '0';
        StringBuilder sum = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        while(i>=0 && j>=0 ){
            int t = getSum(a.charAt(i),b.charAt(j),c);
            if(t==1){
                c='0';
                sum.append('1');
            }else if(t==0){
                c='0';
                sum.append('0');
            }else if(t==10){
                c='1';
                sum.append('0');
            }else{
                c='1';
                sum.append('1');
            }
            i--;j--;
        }
        while(i>=0){
            int t = getSum(a.charAt(i),'0',c);
            if(t==1){
                c='0';
                sum.append('1');
            }else if(t==0){
                c='0';
                sum.append('0');
            }else if(t==10){
                c='1';
                sum.append('0');
            }else{
                c='1';
                sum.append('1');
            }
            i--;
        }
        while(j>=0){
            int t = getSum('0',b.charAt(j),c);
            if(t==1){
                c='0';
                sum.append('1');
            }else if(t==0){
                c='0';
                sum.append('0');
            }else if(t==10){
                c='1';
                sum.append('0');
            }else{
                c='1';
                sum.append('1');
            }
            j--;
        }
        if(c=='1')sum.append('1');
        return sum.reverse().toString();
    }
    public static int getSum(char a,char b,char c){
        int sum;
        if(c == '0'){
            if((a=='1' && b=='0') || (a=='0' && b=='1')){
                sum = 1;
            }else if(a=='0' && b=='0'){
                sum=0;
            }else{
                sum=10;
            }
        }else{
            if((a=='1' && b=='0') || (a=='0' && b=='1')){
                sum = 10;
            }else if(a=='0' && b=='0'){
                sum=1;
            }else{
                sum=11;
            }
        }
        return sum;
    }
}