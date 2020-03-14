package app;

public class Televisor{
    private int volume;
    private int canal;

    public Televisor(){
        this.volume = 50;
        this.canal = 10;
    }
    private void setVolume(int volume){
        this.volume = volume;
        if(this.volume<0)
            this.volume = 0;
        if(this.volume>100)
            this.volume = 100;
    }
    private void setCanal(int canal){
        this.canal = canal;
        if(this.canal<=0)
            this.canal = 1;
    }
    public void aumentarVolume(){
        this.setVolume(this.volume+1);
        System.out.println("Nível de volume " + this.volume);
    }
    public void diminuirVolume(){
        this.setVolume(this.volume-1);
        System.out.println("Nível de volume " + this.volume);
    }
    public void mudarCanal(int canal){
        this.setCanal(canal);
        System.out.println("Canal " + this.canal);
    }

}