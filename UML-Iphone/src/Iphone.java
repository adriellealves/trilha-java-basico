
import papeisIphone.AparelhoTelefone;
import papeisIphone.NavegadorInternet;
import papeisIphone.ReprodutorMusica;

public class Iphone implements NavegadorInternet, AparelhoTelefone, ReprodutorMusica {

    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA");
    }
    public void adicionarNovaAba(){
    System.out.println("ADICIONANDO NOVA ABA");
    } 
    public void atualizarPagina(){
    System.out.println("ATUALIZANDO PAGINA");
    }

    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA");
    }

    public void ligar() {
        System.out.println("LIGANDO...");
    }

    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }

}