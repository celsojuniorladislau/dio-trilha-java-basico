import java.util.Scanner; 
    
public class MesaDoSobrinho {
    public static void main(String[] args) {
        System.out.println("Por quantos meses você quer poupar a sua mesada? digite somente a quantidade de meses");

        try (Scanner leitor = new Scanner(System.in)) {
            int entrada = leitor.nextInt();
            int mesada = 50;
            int multiplicacao = entrada * mesada;
            
            System.out.println("Voce terá " + multiplicacao + " reais");
            System.out.println();
        }
    }
}  