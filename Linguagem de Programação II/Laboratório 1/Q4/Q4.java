import java.util.Scanner;

class Q4{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        Integer n = in.nextInt();
        System.out.printf("%s\t%s\t%s\t%s\n", "N", "10*N", "100*N", "1000*N");
        for(Integer i = 1; i<=n; i++)
            System.out.printf("%d\t%d\t%d\t%d\n", i, i*10, i*100, i*1000);
        
    }
}