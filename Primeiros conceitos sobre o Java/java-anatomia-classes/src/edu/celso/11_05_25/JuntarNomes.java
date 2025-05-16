// package edu.celso.11_05_25;

public class JuntarNomes {

    public static void main(String[] args) {

        String primeiroNome = "Celso";
        String segundoNome = "Tadeu";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
