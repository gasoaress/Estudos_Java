package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        System.out.println("Processo seletivo!\n");
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};
        //SelecionarCandidatos();
        for (String candidato : candidatos) {
            EntrarEmContato(candidato);
        }
    }

    static void EntrarEmContato(String candidato) {

        int ligacoesRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = Atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                ligacoesRealizadas++;
            } else {
                System.out.println("CONTATO REALIZADO COM SUCESSO COM O CANDIDATO "+ candidato + "\n");
            }

        } while (continuarTentando && ligacoesRealizadas < 3);

        if (atendeu) {
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + ligacoesRealizadas + " TENTATIVA" + "\n");
        } else {
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MAXIMO TENTATIVAS " + ligacoesRealizadas + " REALIZADA" + "\n");
        }

    }

    static void SelecionarCandidatos() {
        // Array com a lista de candidatos
        String[] candidatos = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
            "DANIELA", "JORGE"};
        int candidatosSelecionados = 0, indice = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && indice < candidatos.length) {
            String candidato = candidatos[indice];
            double salarioPretendido = valorPretendido();
            String[] aprovados = new String[candidatos.length];
            // System.out.println("O canditato " + candidato + " Solicitou o seguinte salario ->" + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado \n");
                candidatosSelecionados++;
                aprovados[indice] = candidato;
            }
            indice++;

        }
        ImprimirAprovado();
    }

    static boolean Atender() {
        return new Random().nextInt(3) == 1;
        /* SE O VALOR ENTRE 1 E 3 FOR 1 LIGACAO == ATENDIDA */
    }

    static void ImprimirAprovado() {
        String[] candidatosSelecionados = {"FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO"};

        //forma indexada
        //quando preciso do indice para complementar a lógica
        System.out.println("Imprimindo com a ordem de seleção pelo índice");
        for (int x = 0; x < candidatosSelecionados.length; x++) {
            System.out.println((x + 1) + "° Candidato é " + candidatosSelecionados[x]);
        }

        //forma abrevida
        //interação total sem precisar da posição ou indice
        System.out.println("Imprimindo todos sem a necessidade de exibir o índice");

        for (String candidato : candidatosSelecionados) {
            System.out.println(candidato);
        }
    }

    // Método que simula o valor pretendido
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void AnalisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para candidato com contraproposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
