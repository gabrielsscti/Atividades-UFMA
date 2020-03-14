package app;

public class Retangulo{
    private Double base;
    private Double altura;
    public Retangulo(){
        this.base = 2.0;
        this.altura = 2.0;
    }
    public void setBase(Double base){
        this.base = base;
    }
    public void setAltura(Double altura){
        this.altura = altura;
    }
    public Double getBase(){
        return this.base;
    }
    public Double getAltura(){
        return this.altura;
    }

    public Double getPerimetro(){
        return (2*this.base)+(2*this.altura);
    }
    public Double getArea(){
        return this.base*this.altura;
    }
}