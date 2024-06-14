//Projeto de Controle de Candidatos

import java.util.concurrent.ThreadLocalRandom;

public class App {
    public static void main(String[] args) throws Exception {
        imprimirSelecionados();
    }

    static void selecaoCandidatos() {
        String [] candidatos = {"Thiago", "Carol", "Ana", "Julio", "Marcela", "Gabriela","Pimenta","Bastos", "Peixoto","Gamaliel"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        Double salarioBase = 2000.;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);

            if(salarioBase >= salarioPretendido) {
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }

    static Double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Thiago", "Carol", "Ana", "Julio", "Marcela", "Gabriela","Pimenta","Bastos", "Peixoto","Gamaliel"};

        //For each
        for(String candidato : candidatos){
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    public static void analisarCandidato(Double salarioPretendido) {
        Double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar para Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
