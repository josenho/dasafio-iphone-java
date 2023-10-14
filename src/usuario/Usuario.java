package usuario;

import funcionalidades.IPhone.Iphone;
import funcionalidades.aparelho_telefonico.AparelhoTelefonico;
import funcionalidades.navegador_internet.NavegadorInternet;
import funcionalidades.reprodutor_musical.ReprodutorMusical;

public class Usuario {
    public static void main(String[] args) {
        Iphone em = new Iphone();

        AparelhoTelefonico telefone = em;
        NavegadorInternet navegador = em;
        ReprodutorMusical reprodutor = em;

        telefone.iniciarCorreioVoz();
        navegador.exibirPagina();
        reprodutor.tocar();
    }
}
