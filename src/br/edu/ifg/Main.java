package br.edu.ifg;

public class Main {
    public static void main(String[] args) {

        Livro livro = new Livro("Os Sete Maridos de Evelyn Hugo", "Taylor Jenkins Reid", "978-85-441-0701-3");

        System.out.printf("""
                ********************************
                Título: %s
                Autor: %s
                ISBN: %s
                ********************************
                %n""", livro.getTitulo(), livro.getAutor(), livro.getIsbn());

        System.out.println("O livro está disponível para empréstimo? " + (livro.isDisponivel() ? "Sim" : "Não"));
        livro.emprestarLivro();

        System.out.println("O livro está disponível para empréstimo? " + (livro.isDisponivel() ? "Sim" : "Não"));
        livro.emprestarLivro();

        livro.devolverLivro();

        System.out.println("O livro está disponível para empréstimo? " + (livro.isDisponivel() ? "Sim" : "Não"));
        livro.emprestarLivro();

    }
}