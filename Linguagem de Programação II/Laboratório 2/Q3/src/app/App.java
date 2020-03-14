package app;

public class App {
    public static void main(String[] args) throws Exception {
        BombaCombustivel b1 = new BombaCombustivel(3.21, 120.0);
        System.out.println("Valor a ser pago: R$" + b1.abastecerPorLitro(30.0));
        System.out.println("Quant de litros colocados: " + b1.abastecerPorValor(20.0));
        System.out.println("Valor a ser pago: R$" + b1.abastecerPorLitro(60.0));
        System.out.println("Quant de litros colocados: " + b1.abastecerPorValor(50.0));
        System.out.println("Quantidade atual na bomba: " + b1.getQuantidadeCombustivel());
        System.err.println("Quant de litros colocados: " + b1.abastecerPorValor(40.0));
        System.out.println("Valor a ser pago: R$" + b1.abastecerPorLitro(8.0));
        System.out.println("Quantidade atual na bomba: " + b1.getQuantidadeCombustivel());
    }
}