import java.util.Scanner;

class Q9{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Integer n;
        
        Double  vendasProduto1=0.0,
                vendasProduto2=0.0,
                vendasProduto3=0.0,
                vendasProduto4=0.0,
                vendasProduto5=0.0;
        System.out.print("Digite a quantidade de produtos vendidos: ");
        n = in.nextInt();
        for(Integer i = 0; i<n; i++){
            Integer nProduto, quantVendida;

            System.out.print("Digite o numero do produto e a quantidade vendida: ");
            nProduto = in.nextInt();
            quantVendida = in.nextInt();
            switch(nProduto){
                case 1:
                    vendasProduto1 += 2.98*quantVendida;
                    break;
                case 2: 
                    vendasProduto2 += 4.50*quantVendida;
                    break;
                case 3:
                    vendasProduto3 += 9.98*quantVendida;
                    break;
                case 4:
                    vendasProduto4 += 4.49*quantVendida;
                    break;
                case 5:
                    vendasProduto5 += 6.87*quantVendida;
                    break;
                default:
                    System.out.println("Por favor, digite um numero valido");
                    i--;
            }
        }
        System.out.println("Produto 1: R$" + vendasProduto1);
        System.out.println("Produto 2: R$" + vendasProduto2);
        System.out.println("Produto 3: R$" + vendasProduto3);
        System.out.println("Produto 4: R$" + vendasProduto4);
        System.out.println("Produto 5: R$" + vendasProduto5);
        System.out.printf("Total em vendas: R$%.2f", vendasProduto1+vendasProduto2+vendasProduto3+vendasProduto4+vendasProduto5);


    }
}