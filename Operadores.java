public class Operadores {

    // public static void main(String[] args) throws Exception {

        // String nomeCompleto = "LINGUAGEM" + "JAVA";
        // System.out.println(nomeCompleto);

        //qual o resultado das expressoes abaixo?
        // String concatenacao ="?"; 

        // System.out.println(concatenacao);

        // concatenacao = 1+1+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+1;

        // System.out.println(concatenacao);

        // concatenacao = 1+"1"+1+"1";

        // System.out.println(concatenacao);

        // concatenacao = "1"+1+1+1;

        // System.out.println(concatenacao);

        // concatenacao = "1"+(1+1+1);

        // System.out.println(concatenacao);

        // int numero = 5;

        // numero = -numero;
       
        // System.out.println(numero);

        // numero = numero * -1;
        // System.out.println(numero);

        
    // }

    // public static void main(String[] args) throws Exception {
    //     int numero = 5;
        
    //     // numero++; // é a mesma coisa de fazer isso: numero = numero + 1;
        

    //     System.out.println(++numero);
    
    //     System.out.println(numero);

        
    // }

    // public static void main(String[] args) throws Exception {
    //   boolean variavel = true;  
    
    //   variavel = !variavel; 

    //   System.out.println(variavel); 
    // }

    // public static void main(String[] args) throws Exception {
    //     // classe Operadores.java
    //     int a, b;

    //     a = 7;
    //     b = 7;
        
    //     // String resultado = a == b ? "verdadeiro" : "falso";
    //     int resultado = a == b ? 1 : 0;

    //     System.out.println(resultado);
    // }

    
    // public static void main(String[] args) throws Exception {
    //     String nomeUm = "Celso";
    //     String nomeDois = new String("Celso");
        
    //     System.out.println(nomeUm == nomeDois); 
    //     // para objetos é interresante que a gente use o equals:
    //     System.out.println(nomeUm.equals(nomeDois));
        
    //     int numero1 = 1;
    //     int numero2 = 2;

    //     if (numero1 == numero2) {
    //         System.out.println("a nossa condição é verdadeira");
            
    //     }

    //     boolean simNao = numero1 == numero2; 

    //     System.out.println("numero1 é igual a numero2? " + simNao);

    //     simNao = numero1 != numero2; 

    //     System.out.println("numero1 é igual a numero2? " + simNao);

    //     simNao = numero1 > numero2; 

    //     System.out.println("numero1 é maior que numero2? " + simNao);
    // }   

    public static void main(String[] args) throws Exception {
        boolean condicao1=true;

        boolean condicao2=true;

        if (condicao1 && (7 < 4) ){
            System.out.println("as duas condições são verdadeiras");

        }

        if (condicao1 || condicao2){
            System.out.println("uma das condições é verdadeira");
        }

        System.out.println("Fim");
    }

}

// o que são classes?
// Uma classe é um modelo ou um molde para criar objetos. Ela define as propriedades e comportamentos que os objetos criados a partir dela terão.
// Em Java, uma classe é definida usando a palavra-chave "class", seguida pelo nome da classe. O nome da classe deve começar com uma letra maiúscula por convenção.
// As classes podem conter variáveis (também chamadas de atributos ou propriedades) e métodos (funções que definem o comportamento da classe).
// As variáveis dentro de uma classe são chamadas de atributos, e elas representam as características ou propriedades do objeto.
// Os métodos são as ações que os objetos podem realizar. Eles podem manipular os atributos da classe e executar operações específicas.

// Todas as ações dentro das classes são consideradas métodos
// Ao fazer a analogia com a vida real, podemos pensar que uma classe é como um carro, e os métodos são as ações que o carro pode realizar, como acelerar, frear, etc.


// tem como programar sem ser orientado a objetos?
// Sim, é possível programar sem usar orientação a objetos. Existem outras abordagens de programação, como programação procedural ou funcional, que não dependem do conceito de classes e objetos. No entanto, a programação orientada a objetos é uma das abordagens mais populares e amplamente utilizadas devido à sua capacidade de organizar e estruturar o código de forma mais eficiente.

// O que é um objeto?
// Um objeto é uma instância de uma classe. Ele representa uma entidade específica que possui atributos e comportamentos definidos pela classe à qual pertence. Em outras palavras, um objeto é uma concretização de uma classe, contendo dados (atributos) e métodos (funções) que operam sobre esses dados.

// o que é main?
// O método "main" é o ponto de entrada de um programa Java. É onde a execução do programa começa. O método "main" deve ser declarado como "public static void main(String[] args)" e pode receber argumentos da linha de comando através do parâmetro "args". Quando você executa um programa Java, o Java Virtual Machine (JVM) procura pelo método "main" para iniciar a execução do código.