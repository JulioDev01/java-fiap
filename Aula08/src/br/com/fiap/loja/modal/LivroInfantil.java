package br.com.fiap.loja.modal;

public class LivroInfantil extends Livro{
    private String ilustrator;

    public LivroInfantil(int codigo, int preco, String autor, String titulo, String isbn, Editora editora, String ilustrator) {
        super(codigo, preco, autor, titulo, isbn, editora);
        this.ilustrator = ilustrator;
    }

    public String getIlustrator() {
        return ilustrator;
    }

    public void setIlustrator(String ilustrator) {
        this.ilustrator = ilustrator;
    }
}
