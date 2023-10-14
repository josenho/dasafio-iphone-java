package funcionalidades.aparelho_telefonico;

public class Phone implements AparelhoTelefonico{

    public void ligar() {
        System.out.println("Ligando...");
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
