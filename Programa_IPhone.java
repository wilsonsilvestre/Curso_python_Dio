// Interface ReprodutorMusical
interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

// Interface AparelhoTelefonico
interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

// Interface NavegadorInternet
interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

// Classe iPhone
class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    // ... outros atributos e métodos específicos do iPhone ...

    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    // Implementações dos outros métodos das interfaces
}