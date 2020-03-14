package app;

public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(9, 28, 2020);
        Data d2 = new Data("Fevereiro", 02, 2010);
        Data d3 = new Data(210, 2017);
        System.out.println("Data 1: " + d1);
        System.out.println("Data 2: " + d2);
        System.out.println("Data 3: " + d3);
        
    }
}