package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemVisitorTest {

    @Test
    void deveExibirLivro() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 256);

        ItemVisitor visitor = new ItemVisitor();
        assertEquals("Livro{titulo='Dom Casmurro', autor='Machado de Assis', paginas=256}", visitor.exibir(livro));
    }

    @Test
    void deveExibirRevista() {
        Revista revista = new Revista("Revista de Tecnologia", 12);

        ItemVisitor visitor = new ItemVisitor();
        assertEquals("Revista{titulo='Revista de Tecnologia', edicao=12}", visitor.exibir(revista));
    }

    @Test
    void deveExibirDvd() {
        Dvd dvd = new Dvd("Central do Brasil", 113);

        ItemVisitor visitor = new ItemVisitor();
        assertEquals("Dvd{titulo='Central do Brasil', duracao=113}", visitor.exibir(dvd));
    }

}
