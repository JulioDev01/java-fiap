package br.com.fiap.loja.modal;

public class Livro extends Produto{
    private String autor;
    private String titulo;
    private String isbn;
    private Editora editora;

    public Livro(int codigo, int preco, String autor, String titulo, String isbn, Editora editora) {
        super(codigo, preco);
        this.autor = autor;
        this.titulo = titulo;
        this.isbn = isbn;
        this.editora = editora;
    }


    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }
}
