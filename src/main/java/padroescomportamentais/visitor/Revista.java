package padroescomportamentais.visitor;

public class Revista implements Item {

    private String titulo;
    private int edicao;

    public Revista(String titulo, int edicao) {
        this.titulo = titulo;
        this.edicao = edicao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdicao() {
        return edicao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirRevista(this);
    }

}
