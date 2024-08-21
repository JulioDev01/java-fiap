public class Funcionario {
    private String nome;
    private int idade;
    private int meses;
    private String cpf;
    private double salario;
    private double metaObdita;

    

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularFerias(int dias) throws Exception {
        if (dias < 1 || dias > 30)
            throw new Exception("Dias inválidos");
        return (salario + salario/3) * dias/30;
    }

    public double calcularPlr(boolean metaObtida, int meses) throws IllegalAccessException {
        if (meses < 1 || meses > 12){
            throw new IllegalAccessException("Quantidade de meses inválido");
        }

        if (metaObtida)
            return salario * 5 * meses/12;
        return 0;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getMetaObdita() {
        return metaObdita;
    }

    public void setMetaObdita(double metaObdita) {
        this.metaObdita = metaObdita;
    }
}
