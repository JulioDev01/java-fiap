import br.com.fiap.banco.modal.ContaCorrente;
import br.com.fiap.banco.modal.ContaInvestimento;
import br.com.fiap.banco.modal.ContaPoupanca;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("123456", 1500, "Marcio José", "1234", 20, 200);
        ContaPoupanca contaPoupanca = new ContaPoupanca("123456", 4000, "Marcio José", "1234", 1.2f);
        ContaInvestimento contaInvestimento = new ContaInvestimento("Conservador", 3.2f, 7200.50f);

        boolean continuarExecucao = true;
        while (continuarExecucao) {
            String escolheConta = JOptionPane.showInputDialog("Insira o número da conta que quer acessar (1, 2 ou 3):\n1) Conta Corrente\n2) Conta Poupança\n3) Conta Investimento\n4) Fechar");

            String acaoCorrente = "";
            String acaoPoupanca = "";
            String acaoInvestimento = "";

            if (escolheConta.equals("1")) {
                acaoCorrente = JOptionPane.showInputDialog("Informe o número da ação que deseja realizar (1, 2, 3, 4, 5 ou 6):\n1) Depositar\n2) Sacar\n3) Consultar Saldo\n4) Aplicar taxa de Manutenção Mensal\n5) Verificar limite do Cheque Especial\n6) Fechar");
            } else if (escolheConta.equals("2")) {
                acaoPoupanca = JOptionPane.showInputDialog("Informe o número da ação que deseja realizar (1, 2, 3, 4 ou 5):\n1) Depositar\n2) Sacar\n3) Consultar Saldo\n4) Calcular Rendimento\n5) Fechar");
            } else if (escolheConta.equals("3")) {
                acaoInvestimento = JOptionPane.showInputDialog("Informe o número da ação que deseja realizar (1, 2, 3, 4 ou 5):\n1) Investir\n2) Resgatar Investimento\n3) Verificar Taxa de Rentabilidade\n4) Perfil de Investimento\n5) Fechar");
            } else if (escolheConta.equals("4")) {
                JOptionPane.showMessageDialog(null, "Volte sempre!");
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
                continue;
            }

            // Métodos Conta Corrente
            if (!acaoCorrente.equals("")) {
                if (acaoCorrente.equals("1")) {
                    float valorDepositoCorrente = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do depósito: "));
                    contaCorrente.depositar(valorDepositoCorrente);
                } else if (acaoCorrente.equals("2")) {
                    float valorSaqueCorrente = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque: "));
                    contaCorrente.sacar(valorSaqueCorrente);
                } else if (acaoCorrente.equals("3")) {
                    contaCorrente.verificarSaldo();
                } else if (acaoCorrente.equals("4")) {
                    contaCorrente.aplicarTaxaManutencao();
                } else if (acaoCorrente.equals("5")) {
                    contaCorrente.verificarLimiteChequeEspecial();
                } else if (acaoCorrente.equals("6")) {
                    JOptionPane.showMessageDialog(null, "Volte sempre!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            }

            // Métodos Conta Poupança
            if (!acaoPoupanca.equals("")) {
                if (acaoPoupanca.equals("1")) {
                    float valorDepositoPoupanca = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do depósito: "));
                    contaPoupanca.depositar(valorDepositoPoupanca);
                } else if (acaoPoupanca.equals("2")) {
                    float valorSaquePoupanca = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do saque: "));
                    contaPoupanca.sacar(valorSaquePoupanca);
                } else if (acaoPoupanca.equals("3")) {
                    contaPoupanca.verificarSaldo();
                } else if (acaoPoupanca.equals("4")) {
                    contaPoupanca.calcularRendimento();
                } else if (acaoPoupanca.equals("5")) {
                    JOptionPane.showMessageDialog(null, "Volte sempre!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            }

            // Métodos Conta Investimento
            if (!acaoInvestimento.equals("")) {
                if (acaoInvestimento.equals("1")) {
                    float valorInvestimento = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do investimento: "));
                    contaInvestimento.investir(valorInvestimento);
                } else if (acaoInvestimento.equals("2")) {
                    float valorResgate = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do resgate: "));
                    contaInvestimento.resgatarDinheiro(valorResgate);
                } else if (acaoInvestimento.equals("3")) {
                    contaInvestimento.verificarTaxaRentabilidade();
                } else if (acaoInvestimento.equals("4")) {
                    JOptionPane.showMessageDialog(null, "O seu perfil de investidor é " + contaInvestimento.getPerfilInvestimento());
                } else if (acaoInvestimento.equals("5")) {
                    JOptionPane.showMessageDialog(null, "Volte sempre!");
                    break;
                } else {
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                }
            }
        }
    }
}