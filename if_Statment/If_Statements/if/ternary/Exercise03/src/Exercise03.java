public class Exercise03 {
    public static void main(String[] args) {
        int sign,signA,signB;
        int x=-100;

        if (x<0) sign=-1;
        else if (x==0) sign=0;
        else sign=1;
        System.out.println(sign);

        signA=x<0?-1:1;
        signA=x==0?0:signA;
        System.out.println(signA);
        signB=x<0?-1: x==0? 0: 1;
        System.out.println(signB);

    }
}