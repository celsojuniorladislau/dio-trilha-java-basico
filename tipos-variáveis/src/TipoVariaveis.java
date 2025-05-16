public class TipoVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        // estudem a classe String que representa texto na aplicação
        // Tipos primitivos
        // byte, short, int, long, float, double, char, boolean
        // Tipos referenciais
        // String, Arrays, Classes, Interfaces, Enum
        // Tipos primitivos
        // byte -> 8 bits -> -128 a 127
        // short -> 16 bits -> -32.768 a 32.767
        // int -> 32 bits -> -2.147.483.648 a 2.147.483.647
        // long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        // float -> 32 bits -> -3.40282347E+38 a 3.40282347E+38
        // double -> 64 bits -> -1.7976931348623157E+308 a 1.7976931348623157E+308
        // char -> 16 bits -> 'a' a 'z'
        // boolean -> true ou false
        // Tipos referenciais
        // String -> "Texto"
        // Arrays -> {1, 2, 3}
        // Classes -> new Classe()
        // Interfaces -> new Interface()
        // Enum -> Enum.TIPO
        // Tipos primitivos
        // byte -> 8 bits -> -128 a 127
        byte idade = 20; // 8 bits
        // short -> 16 bits -> -32.768 a 32.767
        short ano = 2023; // 16 bits
        // int -> 32 bits -> -2.147.483.648 a 2.147.483.647
        int cep = 12345678; // 32 bits
        // long -> 64 bits -> -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
        long cpf = 12345678901L; // 64 bits
        // float -> 32 bits -> -3.40282347E+38 a 3.40282347E+38
        float pi = 3.14F; // 32 bits
        // double -> 64 bits -> -1.7976931348623157E+308 a 1.7976931348623157E+308
        // char -> 16 bits -> 'a' a 'z'
        char letra = 'A'; // 16 bits
        // boolean -> true ou false
        boolean verdadeiro = true; // 1 bit
        // Tipos referenciais
        // String -> "Texto"
        String nome = "Lucas"; // 16 bits
        // Arrays -> {1, 2, 3}
        int[] numeros = {1, 2, 3}; // 32 bits
        // Classes -> new Classe()
        // Interfaces -> new Interface()
        // Enum -> Enum.TIPO
        
        
        double salario = 1500.40;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; // Casting necessário
        // Casting é a conversão de um tipo para outro, por exemplo, de int para short
        
        int numero = 5;
        numero = 10;
        System.out.println(numero);

        final double VALOR_DE_PI = 3.14; // Constante, valor fixo

        final String NOME_DO_SISTEMA = "Sistema de Cadastro de Fornecedores"; 
        System.out.println(NOME_DO_SISTEMA);

     


    }
}