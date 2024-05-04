package br.com.fiap.loja.model;

public class Produto {
    private String nome;
    private int id;
    private float preco;
    private String descricao;
    private float peso;

    public Produto(){}

    public Produto(String nome, int id, float preco, String descricao, float peso) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
        this.descricao = descricao;
        this.peso = peso;
    }

    //Sobrecarga de métodos: métodos na mesma classe, com o mesmo nome e parametros diferentes
    public double calcularPrecoComDesconto(double porcentagem){
        return (preco * porcentagem / 100) - preco;
    }

    public double calcularPrecoComDesconto(int quantidade){
        if (quantidade >= 5 && quantidade <= 9)
            return calcularPrecoComDesconto(10.0) * quantidade;

        if (quantidade >= 10)
            return calcularPrecoComDesconto(20.0) * quantidade;

        return preco;
    }

    public double calcularPrecoComDesconto(String cupom){
        if (cupom.equals("FIAP25")){
            return calcularPrecoComDesconto(25.0);
        }
        if (cupom.equals("FIAP40")){
            return calcularPrecoComDesconto(40.0);
        }
        return preco;
    }

    public double calcularFrete(double distancia){
        double frete = (peso * 0.1) + (distancia * 0.2);
        if (preco > 250 && peso < 5 && distancia > 100){
            return 0;
        }
        return (peso * 0.1) + (distancia * 0.2);
    }


    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
