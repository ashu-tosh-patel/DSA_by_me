public class Main {
    public static void main(String[] args) {
//
//        BitWise bit = new BitWise();
//        System.out.println(bit.divideBy2(8));
//        System.out.println(bit.multiplyBy2(8));
//        System.out.println(bit.log2(8));

        BitProblems bit = new BitProblems();
//        System.out.println(bit.countSetBits(39));

        if (bit.isPow2(128))
            System.out.println("yes");
        else System.out.println("no");
    }
}
