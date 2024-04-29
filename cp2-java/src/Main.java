import br.com.fiap.banco.modal.ContaCorrente;
import br.com.fiap.banco.modal.ContaInvestimento;
import br.com.fiap.banco.modal.ContaPoupanca;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Instanciando ContaCorrente
        ContaCorrente contaCorrente = new ContaCorrente("123456", 1500,
                "Marcio José", "1234", 20, 200);

        //Instanciando ContaPoupanca
        ContaPoupanca contaPoupanca = new ContaPoupanca("123456", 4000,
                "Marcio José", "1234", 1.2f);

        //Intanciando ContaInvestimento
        ContaInvestimento contaInvestimento = new ContaInvestimento("Conservador",
                3.2f, 7200.50f);


        boolean continuarExecucao = true;
        while (continuarExecucao){
            //Fazendo o menu
            int escolheConta = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de " +
                    "que conta quer acessar (1, 2 ou 3): \n1) Conta Corrente \n2) Conta Poupança " +
                    "\n3) Conta Investimento \n4) Fechar"));

            int acaoCorrente = 0;
            int acaoPoupanca = 0;
            int acaoInvestimento = 0;
            if (escolheConta == 1) {
                acaoCorrente = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de que " +
                        "ação quer realizar (1, 2, 3, 4, 5 ou 6): \n1) Depositar \n2) Sacar \n3) Consultar Saldo " +
                        "\n4) Aplicar taxa de Manutenção Mensal \n5) Verificar limite do Cheque Especial " +
                        "\n6) Fechar"));
            } else if (escolheConta == 2) {
                acaoPoupanca = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de que " +
                        "ação quer realizar (1, 2, 3, 4 ou 5): \n1) Depositar \n2) Sacar \n3) Consultar Saldo " +
                        "\n4) Calcular Rendimento \n5) Fechar"));
            } else if (escolheConta == 3) {
                acaoInvestimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de " +
                        "que ação quer realizar (1, 2, 3 ou 4): \n1) Investir \n2) Resgatar Investimento " +
                        "\n3) Verificar Taxa de Rentabilidade \n4) Fechar"));
            } else if (escolheConta == 4){
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Não tem nenhuma opção com esse número.");
            }


            //Métodos Conta Corrente
            if (acaoCorrente == 1) {
                float valorDepositoCorrente = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do deposito: "));
                contaCorrente.depositar(valorDepositoCorrente);
            } else if (acaoCorrente == 2){
                float valorSaqueCorrente = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque: "));
                contaCorrente.sacar(valorSaqueCorrente);
            } else if (acaoCorrente == 3){
                contaCorrente.verificarSaldo();
            } else if (acaoCorrente == 4){
                contaCorrente.aplicarTaxaManutencao();
            } else if (acaoCorrente == 5){
                contaCorrente.verificarLimiteChequeEspecial();
            } else if (acaoCorrente == 6){
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
            }

            //Métodos Conta Poupança
            if (acaoPoupanca == 1) {
                float valorDepositoPoupanca = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do deposito: "));
                contaPoupanca.depositar(valorDepositoPoupanca);
            } else if (acaoPoupanca == 2){
                float valorSaquePoupanca = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque: "));
                contaPoupanca.sacar(valorSaquePoupanca);
            } else if (acaoPoupanca == 3){
                contaPoupanca.verificarSaldo();
            } else if (acaoPoupanca == 4){
                contaPoupanca.calcularRendimento();
            } else if (acaoPoupanca == 5){
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
            }

            //Métodos Conta Investimento
            if (acaoInvestimento == 1) {
                float valorInvestimento = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do investimento: "));
                contaInvestimento.investir(valorInvestimento);
            } else if (acaoInvestimento == 2){
                float valorResgate = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do resgate: "));
                contaInvestimento.resgatarDinheiro(valorResgate);
            } else if (acaoInvestimento == 3){
                contaInvestimento.verificarTaxaRentabilidade();
            } else if (acaoInvestimento == 4){
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
            }
        }
    }
}