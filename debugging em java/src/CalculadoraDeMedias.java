import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] alunos = {
            "João", "Maria", "Pedro", "Lucas"
        };

        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.println("A média da turma é: " + media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.print("Digite a nota de " + aluno + ": ");
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}