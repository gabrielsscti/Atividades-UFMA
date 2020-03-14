package app;

public class App {
    public static void main(String[] args) throws Exception {
        Racional r1 = new Racional(3, 2);
        Racional r2 = new Racional(7, 4);
        Racional r3 = r1.somar(r2);
        System.out.println(r1 + " + " + r2 + " = " + r3);
        r3 = r1.subtrair(r2);
        System.out.println(r1 + " - " + r2 + " = " + r3);
        r3 = r1.multiplicar(r2);
        System.out.println(r1 + " * " + r2 + " = " + r3);
        r3 = r1.dividir(r2);
        System.out.println(r1 + " : " + r2 + " = " + r3);
        System.out.println(r1.getFormaRacional() + ", " +  r2.getFormaRacional() + ", " + r3.getFormaRacional());

    }
}