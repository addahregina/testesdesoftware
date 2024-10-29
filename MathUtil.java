package tdd;

public class MathUtil {

    // ... é chamado de varargs argumentos(parametros) variaveis
    public static int mdc(int ...valores){  //valores é um vetor

        int a = valores(0);
        for(int i = 1; i< valores.lenght; i++){
            final int b = valores[i];
            a = mdc(a,b);
        }
      
        /* throw new UnsupportedOperationException(){
            "Não implementado ainda";
        } 
        */
        
        return a
    }
    
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

        //P8, P12
        if(a == b){
            return a;
        }

        return -1;

    }

}
