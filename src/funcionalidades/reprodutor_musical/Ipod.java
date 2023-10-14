package funcionalidades.reprodutor_musical;

public class Ipod implements ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando música...");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void selecionarMusica() {
        System.out.println("Selecione a música.");
    }
}
