package padroescomportamentais.visitor;

public interface Visitor {

    String exibirLivro(Livro livro);
    String exibirRevista(Revista revista);
    String exibirDvd(Dvd dvd);

}
