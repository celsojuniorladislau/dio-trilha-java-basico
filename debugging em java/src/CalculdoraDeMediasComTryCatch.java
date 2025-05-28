import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculdoraDeMediasComTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {
            "João", "Maria", "Pedro", "Lucas"
        };
        
        try {
            double media = calculaMediaDaTurma(alunos, scanner);
            System.out.println("A média da turma é: " + media);
        } catch (InputMismatchException e) {
            System.err.println("O valor digitado não é um número válido. Por favor, insira apenas números.");
        } finally {
            scanner.close();
        }
    }
    
    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        
        for (String aluno : alunos) {
            boolean entradaValida = false;
            
            while (!entradaValida) {
                try {
                    System.out.print("Digite a nota de " + aluno + ": ");
                    double nota = scanner.nextDouble();
                    
                    if (nota < 0 || nota > 10) {
                        System.out.println("Por favor, digite uma nota entre 0 e 10.");
                        continue;
                    }
                    
                    soma += nota;
                    entradaValida = true;
                    
                } catch (InputMismatchException e) {
                    System.err.println("Entrada inválida. Por favor, digite um número.");
                    scanner.nextLine(); // Limpa o buffer do scanner
                }
            }
        }
        
        return soma / alunos.length;
    }
}

//Codigo corrigido com o uso do claude 4, dia 27/05/2025, as 9:00 da manhã.