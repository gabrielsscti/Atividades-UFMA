package app;

public class BombaCombustivel{
    private Double valorLitro;
    private Double quantidadeCombustivel;

    public BombaCombustivel(Double valorLitro, Double quantidadeCombustivel){
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public Double getQuantidadeCombustivel(){
        return this.quantidadeCombustivel;
    }
    private Boolean setQuantidadeCombustivel(Double quantidadeCombustivel){
        if(quantidadeCombustivel<0.0)
            return false;
        this.quantidadeCombustivel = quantidadeCombustivel;
        return true;
    }

    public Double abastecerPorValor(Double valor){
        Double litrosAbastecidos = valor/this.valorLitro;
        if(setQuantidadeCombustivel(this.quantidadeCombustivel-litrosAbastecidos))
            return valor/this.valorLitro;
        return 0.0;
    }
    public Double abastecerPorLitro(Double quantidadeLitros){
        if(setQuantidadeCombustivel(this.quantidadeCombustivel-quantidadeLitros))
            return (quantidadeLitros*valorLitro);
        return 0.0;
    }
}