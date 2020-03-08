
import java.util.Scanner;

class Q1{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Integer nTanques, sumGasolina=0, sumKm=0;
        System.out.print("Digite o número de tanques: ");
        nTanques = in.nextInt();
        for(Integer i = 0; i<nTanques; i++){
            Integer quilometragemAtual, consumoAtual;
            System.out.printf("Digite a quilometragem dirigida e o consumo em litros para o tanque #%d: ", i+1);
            quilometragemAtual = in.nextInt();
            consumoAtual = in.nextInt();
            System.out.printf("O Consumo foi %.2fkm/l\n", quilometragemAtual.floatValue()/consumoAtual.floatValue());
            sumGasolina += consumoAtual;
            sumKm += quilometragemAtual;
        }
        System.out.printf("Ao final, foram consumidos %d litros de gasolina em %d kilometros andados\n", sumGasolina, sumKm);
        
    }
}