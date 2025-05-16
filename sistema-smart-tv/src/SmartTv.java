public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
    }

    public String statusTv() {
        return ligada ? "Sim" : "Não";
    }

    public void aumentarVolume() {
        volume++; // é igual a: volume = volume + 1;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume() {
        volume--; // é igual a: volume = volume - 1;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal() {
        canal++;
    }

    public void diminirCanal() {
        canal--;
    }
}
