class Solution {
    public int minimizeXor(int num1, int num2) {
        int result = num1;
        int tarBC = Integer.bitCount(num2);// set bits in num2
        int setBC = Integer.bitCount(result);// current set bits in result
        int currentBit = 0; // LSB i.e. 0
        while(setBC < tarBC){
            if(!isSet(result,currentBit)){
                result = setBit(result,currentBit);
                setBC++;
            }
            currentBit++;
        }
        while(setBC > tarBC){
            if(isSet(result,currentBit)){
                result = unsetBit(result,currentBit);
                setBC--;
            }
            currentBit++;
        }
        return result;
    }
    private boolean isSet(int x, int bit){
        return (x & (1 << bit)) != 0;
    }
    private int setBit(int x, int bit){
        return x | (1<<bit);
    }
    private int unsetBit(int x, int bit){
        return x & ~(1<<bit);
    }
}