import java.util.Scanner;
import java.math.*;

class Q7{

    static Integer getAlgarism(Integer n, Integer pos){
        Integer dividingFactor = (int)(Math.pow(10, pos-1));
        return ((n%((int)Math.pow(10, pos))/(dividingFactor)));
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o numero desejado: ");
        Integer n = in.nextInt();

        Integer x1 = getAlgarism(n, 1), 
                x2 = getAlgarism(n, 2),
                x3 = getAlgarism(n, 3),
                x4 = getAlgarism(n, 4),
                x5 = getAlgarism(n, 5);

        while(true){
            if(x5==0){
                System.out.print("Por favor, digite um numero com 5 algarismos: ");
                n = in.nextInt();
                x1 = getAlgarism(n, 1);
                x2 = getAlgarism(n, 2);
                x3 = getAlgarism(n, 3);
                x4 = getAlgarism(n, 4);
                x5 = getAlgarism(n, 5);
            }else{
                if(x1==x5 && x2==x4)
                    System.out.println(n + " é palindromo");
                else
                    System.out.println(n + " não é palindromo");

                break;
            }
        }
    }
}