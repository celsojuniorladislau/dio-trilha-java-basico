import java.util.Scanner;

public class contador {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digito o Primeiro Número: ");
        int primeiroNumero = entrada.nextInt();
        System.out.println("Digito o Segundo Número: ");
        int segundoNumero = entrada.nextInt();

        try {
            contar(primeiroNumero, segundoNumero);

        }catch (ParametrosInvalidosException exception) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }

        entrada.close();
    }

    static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        if (primeiroNumero > segundoNumero) {
            throw new ParametrosInvalidosException();
        }

        int contagem = segundoNumero - primeiroNumero;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        

    }

}



