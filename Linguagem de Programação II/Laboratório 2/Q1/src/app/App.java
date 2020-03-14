package app;

public class App {
    public static void main(String[] args) throws Exception {
        Retangulo r1 = new Retangulo();
        r1.setBase(4.5);
        r1.setAltura(1.2);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimetro());
    }
}