package funcionalidades.IPhone;

import funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import funcionalidades.navegador_internet.NavegadorInternet;
import funcionalidades.reprodutor_musical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void tocar(){
        System.out.println("Tocando música pelo IPhone...");
    }
    
    public void pausar(){
        System.out.println("Música no IPhone pausada.");
    }

    public void selecionarMusica(){
        System.out.println("Selecionando música no IPhone.");
    }

    public void ligar(){
        System.out.println("Ligando por IPhone...");
    }

    public void atender(){
        System.out.println("Atendendo ligação por IPhone...");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz por IPhone...");
    }

    public void exibirPagina(){
        System.out.println("Exibindo página por IPhone...");
    }

    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba por IPhone...");
    }

    public void atualizarPagina(){
        System.out.println("Atualizando página por IPhone...");
    }
}
