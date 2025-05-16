public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("Status Atual -> Tv Ligada ? " + smartTv.statusTv());

        smartTv.ligar();
        System.out.println("Ligando a TV...");
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.statusTv());

        System.out.println("Volume Atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Mudando Canal...");

        smartTv.mudarCanal(12);

        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("Aumentando Canal...");
        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.desligar();
        System.out.println("Desligando a TV...");
        System.out.println("Novo Status -> Tv Ligada ? " + smartTv.statusTv());
    }
}
