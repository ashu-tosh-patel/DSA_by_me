public class BitProblems {

    //to count set bits in an integer
    //Brian kerningam's algorithm
    public int countSetBits(int num) {
        int res = 0;
        while (num > 0) {
            num = (num & (num - 1));
            res++;
        }
        return res;
    }
    //to check if a given no. is power of 2 or not
    //use of brian kerningam
    boolean isPow2(int num){
        if (num==0)
            return false;
        return ((num&(num-1))==0);
    }


}
