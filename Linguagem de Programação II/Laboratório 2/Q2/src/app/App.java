package app;

public class App {
    public static void main(String[] args) throws Exception {
        Televisor t1 = new Televisor();
        for(Integer i = 0; i<10; i++)
            t1.aumentarVolume();
        for(Integer i = 0; i<25; i++)
            t1.diminuirVolume();
        t1.mudarCanal(12);
        t1.aumentarVolume();
        t1.mudarCanal(8);
        t1.mudarCanal(4);
    }
}