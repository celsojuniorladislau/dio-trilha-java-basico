import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        
       String [] candidatos = { "João", "Maria", "José", "Ana", "Pedro"};
       for (String candidato: candidatos) {
           entrandoEmContato(candidato);
       }
    }

    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando)
                tentativasRealizadas++;
            else {
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa.");
        }else {
            System.out.println("Não conseguimos contato com " + candidato + " após o número maximo de " + tentativasRealizadas + " tentativas.");

        }

    }

    // Metodo Auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {

        String [] candidatos = { "João", "Maria", "José", "Ana", "Pedro"};
        System.out.println("Imprimindo a lista de candidatos informado o indice do elemento");
        for (int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O canditado de nº " + (indice + 1) + " é o " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação (for each)");

        for (String candidato : candidatos) {
            System.out.println("O candidato foi " + candidato + ".");
        }
    }

    static void selacaoCanditados(){
      
        String [] candidatos = { "João", "Maria", "José", "Ana", "Pedro",
                                  "Lucas", "Fernanda", "Carla", "Roberto", "Patrícia", "Ruan", "Cristiano" };
        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido){
                System.out.println("Candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionados++;
            } 
                candidatoAtual++;
        }
        
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretedido){
       double salarioBase = 2000.00;
       if (salarioBase> salarioPretedido) {
           System.out.println("Ligar para o candidato");
       } else if (salarioBase == salarioPretedido) {
           System.out.println("Ligar para o candidato com a contra proposta");
       }
         else {
              System.out.println("Aguardando o resultado dos demais candidatos");
         }
    }

    
}
