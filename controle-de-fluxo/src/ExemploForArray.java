public class ExemploForArray {
    public static void main(String[] args) {
        //Em arrays o indice inicia em 0
        //O tamanho do array é 4, logo o último indice é 3
        //O array é um objeto, logo o tamanho do array é obtido com a propriedade length
        // String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // for (int x=0; x<alunos.length; x++) {
        //     System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        // }

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
        // for each é uma forma mais simples de percorrer arrays
        // for each percorre o array e atribui o valor a variavel aluno 
        // O for each não tem o controle do indice, logo não é possível saber o indice do elemento
        // for each é mais simples e mais legível   
        for(String aluno : alunos) {
            System.out.println("O Nome do aluno é: " + aluno);
        }
    }
    
}
