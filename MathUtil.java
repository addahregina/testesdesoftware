package tdd;

public class MathUtil {

    public static int mdc(int a, int b) {

        //P7
        a = Math.abs(a);
        b = Math.abs(b);

        //P6
        final int maior = Math.max(a,b);
        b = Math.min(a, b);
        a = maior;

        //P1
        if(b>0 && a % b == 0){
            return b;
        }

        //P3
        if(b == 0){
            return Math.abs(a);
        }

        //P8
        if(a == b){
            return a;
        }

        return -1;

    }

}
