package br.edu.ifg;

/**
 * Classe que representa um livro.
 * Cada livro possui um título, autor e ISBN.
 * O livro pode estar disponível ou indisponível para empréstimo.
 */
public class Livro {

    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    /**
     * Construtor da classe br.edu.ifg.Livro.
     * Inicializa os atributos título, autor e ISBN do livro.
     * O livro é inicializado como disponível.
     * @param titulo título do livro
     * @param autor autor do livro
     * @param isbn ISBN do livro
     */
    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    /**
     * Retorna o título do livro.
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Retorna o autor do livro.
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Retorna o ISBN do livro.
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Verifica se o livro está disponível para empréstimo.
     * @return true se o livro está disponível, false se não está
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * Realiza o empréstimo do livro.
     * Se o livro estiver disponível, altera o estado para indisponível.
     * Exibe uma mensagem informando se o empréstimo foi realizado ou se o livro já está emprestado.
     */
    public void emprestarLivro() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Empréstimo realizado com sucesso.\n");
        } else {
            System.out.println("Livro indisponível para empréstimo.\n");
        }
    }

    /**
     * Realiza a devolução do livro.
     * Altera o estado para disponível e exibe uma mensagem de confirmação.
     */
    public void devolverLivro() {
        disponivel = true;
        System.out.println("Devolução realizada com sucesso.\n");
    }
}
