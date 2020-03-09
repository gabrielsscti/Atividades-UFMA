import java.math.*;

class Q10{
    public static void main(String args[]){
        Integer n = 500;
        for(Integer i = 1; i<=n; i++){
            for(Integer j = 1; j<=n; j++){
                System.out.printf("%d^2 + %d^2 = %d\n", i, j, Math.round(Math.pow(i, 2)+Math.pow(j,2)));
            }
        }
    }
}