import java.util.Scanner;

class Q3{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o número de funcionários: ");
        Integer nFuncionarios = in.nextInt();
        for(Integer i = 0; i<nFuncionarios; i++){
            System.out.printf("Digite as horas trabalhadas e o preço por hora do funcionário %d: ", i+1);
            Integer horasTrabalhadas = in.nextInt(), precoHora = in.nextInt();
            Integer horasNormais = (horasTrabalhadas>40) ? 40 : horasTrabalhadas;
            Integer horasExtras = (horasTrabalhadas<=40) ? 0 : (horasTrabalhadas - horasNormais);
            Double salario = (horasNormais*precoHora) + (horasExtras*(precoHora*0.5));
            System.out.printf("O salário bruto é %.2f\n", salario);
        }
    }
}