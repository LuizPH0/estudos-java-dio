import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSeleciona();
    }
    static void imprimirSeleciona(){
        String [] candidatos = {"João", "Natasha", "Ana", "Paula", "Bruno", "Armando"};

        System.out.println("Imprimindo lista de candidatos com indíce do elemento");
        for (int i=0 ; i < candidatos.length ; i++){
            System.out.printf("O candidato %s está na posição %d\n", candidatos[i], (i+1));
        }

    }
    static void selecaoCandidato(){
        String [] candidatos = {"João", "Natasha", "Ana", "Paula", "Bruno", "Armando", "Gustavo", "Maycon", "Thiago", "Maria"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.00;
        while (candidatosSelecionados < 5) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato "+candidato+" foi selecionado! Parabéns!");
                candidatosSelecionados++;
            }else{
                System.out.println("O candidato "+candidato+ " não foi selecionado, pois o seu orçamento é muito alto.");
            }
            candidatosAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000;
        if (salarioPretendido > salarioBase){
            System.out.println("Obrigado por participar do processo seletivo!");
        }else{
            System.out.println("Parabéns! Você foi contratado!");
        }

    }
}
