public class ResultadoEscolar {
    public static void main(String[] args) throws Exception {
        
        int nota = 10;
       
        if(nota >= 7) // sempre tem que ser true ou false
            System.out.println("Aprovado");

        else if(nota >= 5 && nota < 7) // sempre tem que ser true ou false
            System.out.println("Fazer prova de recuperação");

        else
            System.out.println("Reprovado");
    }
}
