

package app;
import java.math.*;

class Racional{
    private Integer numerador;
    private Integer denominador;

    public Racional(Integer numerador, Integer denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        this.reduce();
    }

    public Racional(){
        this.denominador = 0;
        this.numerador = 0;
    }

    private Boolean isValidRacional(){
        return (this.denominador!=0);
    }

    private int gcd(int a, int b){
        if(a==0)
            return b;
        return gcd(b%a, a);
    }

    private void reduce(){
        Integer greatestCommonDivisor = gcd(this.denominador, this.numerador);
        while(greatestCommonDivisor!=1){
            this.denominador /= greatestCommonDivisor;
            this.numerador /= greatestCommonDivisor;
            greatestCommonDivisor = gcd(this.denominador, this.numerador);
        }
    }

    public Integer getNumerador(){
        return this.numerador;
    }
    public Integer getDenominador(){
        return this.denominador;
    }
    public void setNumerador(Integer numerador){
        this.numerador = numerador;
    }
    public void setDenominador(Integer denominador){
        this.denominador = denominador;
    }

    public Racional somar(Racional subject){
        Integer newDenominador = this.denominador * subject.denominador;
        Integer newNumerador = ((newDenominador/this.getDenominador())*this.getNumerador()) + ((newDenominador/subject.getDenominador())*subject.getNumerador());
        Racional r = new Racional(newNumerador, newDenominador);
        r.reduce();
        return r;
    }

    public Racional subtrair(Racional subject){
        Integer newDenominador = this.denominador * subject.denominador;
        Integer newNumerador = ((newDenominador/this.getDenominador())*this.getNumerador()) - ((newDenominador/subject.getDenominador())*subject.getNumerador());
        Racional r = new Racional(newNumerador, newDenominador);
        r.reduce();
        return r;
    }

    public Racional multiplicar(Racional subject){
        Racional r = new Racional(this.numerador*subject.numerador, this.denominador*subject.denominador);
        r.reduce();
        return r;
    }

    public Racional dividir(Racional subject){
        Racional r = new Racional(this.numerador*subject.denominador, this.denominador*subject.numerador);
        r.reduce();
        return r;
    }

    public Double getFormaRacional(){
        return (this.numerador.doubleValue()/this.denominador.doubleValue());
    }

    public String toString(){
        return this.getNumerador() + "/" + this.getDenominador();
    }
    
}