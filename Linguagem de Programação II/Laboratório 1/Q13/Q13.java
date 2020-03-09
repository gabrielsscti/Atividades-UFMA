import java.math.*;

class Q13{

    static Double calculatePi(Integer n){
        Double r = 0.0;
        Integer denominator = 1;
        Boolean isSum = true;
        for(Integer i = 0; i<n; i++){
            if(isSum)
                r += (4.0/denominator);
            else
                r -= (4.0/denominator);
            denominator += 2;
            isSum = !isSum;

        }
        return r;
        
    }
    public static void main(String args[]){
        Integer maxSerie = 200000;
        Integer arrived31=0, arrived314=0, arrived3141=0, arrived31415=0, arrived314159=0;
        Double ultimoPi = 0.0;
        Integer denominator = 1;
        Boolean isSum = true;
        System.out.println("n\tPI");
        for(Integer i = 0; i<maxSerie; i++){
            if(isSum)
                ultimoPi += 4.0/denominator;
            else
                ultimoPi -= 4.0/denominator;
            denominator += 2;
            isSum = !isSum;
            Double actPi = ultimoPi;
            System.out.printf("%d\t%f\n", i+1, actPi);
            if((int)(actPi*10)==31){
                if(arrived31==0)
                    arrived31 = i+1;
            }
            if((int)(actPi*100)==314){
                if(arrived314==0)
                    arrived314 = i+1;
            }
            if((int)(actPi*1000)==3141){
                if(arrived3141==0)
                    arrived3141 = i+1;
            }
            if((int)(actPi*10000)==31415){
                if(arrived31415==0)
                    arrived31415 = i+1;
            }
            if((int)(actPi*100000)==314159){
                if(arrived314159==0)
                    arrived314159 = i+1;
                break;
            }
        }
        System.out.println("Achado 3.1 em " + arrived31);
        System.out.println("Achado 3.14 em " + arrived314);
        System.out.println("Achado 3.141 em " + arrived3141);
        System.out.println("Achado 3.1415 em " + arrived31415);
        System.out.println("Achado 3.14159 em " + arrived314159);

    }
}