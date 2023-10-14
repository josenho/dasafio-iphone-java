package funcionalidades.navegador_internet;

public class Internet implements NavegadorInternet{

    public void exibirPagina() {
        System.out.println("Exibindo nova página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
