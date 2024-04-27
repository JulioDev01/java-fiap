package br.com.fiap.tds.model;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;


    //Métodos
    public void inicializa(int capacidade, int totalAndares){
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
    };

    public void entra(){
        if (pessoasPresentes < capacidade){
            this.pessoasPresentes ++;
            System.out.println("Uma pessoa entrou no elevador");
        } else {
            System.out.println("O elevador está cheio, não é possível entrar");
        }
    };

    public void sai(){
        if (pessoasPresentes > 0){
            this.pessoasPresentes --;
            System.out.println("Uma pessoa saiu do elevador");
        } else {
            System.out.println("Não há ninguem no elevador");
        }

    };

    public void sobe(){
        if (andarAtual < totalAndares){
            this.andarAtual ++;
            System.out.println("O elevador subiu um andar");
        } else {
            System.out.println("O elevador já está no ultimo andar");
        }
    };

    public void desce(){
        if (andarAtual > 0){
            this.andarAtual --;
            System.out.println("O elevador desceu um andar");
        } else {
            System.out.println("O elevador já está no térreo");
        }

    };




    //Getters e Setters
    public int getAndarAtual() {
        return andarAtual;
    }
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }



    public int getTotalAndares() {
        return totalAndares;
    }
    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }



    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }



    public int getPessoasPresentes() {
        return pessoasPresentes;
    }
    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
