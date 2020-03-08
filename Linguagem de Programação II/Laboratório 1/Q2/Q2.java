import java.util.Scanner;

class Q2{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Integer nItens;
        Double vendaTotal = 0.0;
        System.out.print("Digite o número de itens vendidos: ");
        nItens = in.nextInt();
        for(Integer i = 0; i<nItens; i++){
            Double vendaAtual;
            System.out.printf("Digite o preço do item #%d: ", i+1);
            vendaAtual = in.nextDouble();
            vendaTotal += vendaAtual;
        }
        Double pagamentoComissao = vendaTotal*0.09;
        Double pagamentoTotal = 200.0 + pagamentoComissao;
        System.out.printf("O pagamento total é R$%.2f(R$200 + R$%.2f)\n", pagamentoTotal, pagamentoComissao);
    }
}