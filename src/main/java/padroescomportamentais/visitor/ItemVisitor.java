package padroescomportamentais.visitor;

public class ItemVisitor implements Visitor {

    public String exibir(Item item) {
        return item.aceitar(this);
    }

    @Override
    public String exibirLivro(Livro livro) {
        return "Livro{" +
                "titulo='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", paginas=" + livro.getPaginas() +
                '}';
    }

    @Override
    public String exibirRevista(Revista revista) {
        return "Revista{" +
                "titulo='" + revista.getTitulo() + '\'' +
                ", edicao=" + revista.getEdicao() +
                '}';
    }

    @Override
    public String exibirDvd(Dvd dvd) {
        return "Dvd{" +
                "titulo='" + dvd.getTitulo() + '\'' +
                ", duracao=" + dvd.getDuracao() +
                '}';
    }
}
