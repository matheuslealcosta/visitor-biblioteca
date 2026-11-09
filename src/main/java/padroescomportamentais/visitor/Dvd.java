package padroescomportamentais.visitor;

public class Dvd implements Item {

    private String titulo;
    private int duracao;

    public Dvd(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirDvd(this);
    }

}
