package Conta;
public abstract class Conta{
    /**
     * Programinha tem por finalidade demonstrar a interação entre
     * contas bancárias
     * @param args
     * @throws Exception
    */

    private double saldo;
    private String conta;
    private String agencia;
    private String tipo;
    private double carteira;

    public Conta(double Saldo, String Conta, String Agencia, String Tipo, double Carteira){
        this.setSaldo(Saldo);
        this.setConta(conta);
        this.setAgencia(Agencia);
        this.setTipo(Tipo);
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double getCarteira() {
        return carteira;
    }
    public void setCarteira(double carteira) {
        this.carteira = carteira;
    }

    public String OperacaoImpressaoSaldo(){
        String bancoDescricao = "Conta Bancária: " + this.getConta();
        String agenciaDescricao = "\nConta Bancária: " + this.getAgencia();
        String tipoDescricao = "\nConta " + this.getTipo();
        String SaldoDescricao = "\nValor de Saldo: R$ " +this.getSaldo();
        return bancoDescricao+agenciaDescricao+tipoDescricao+SaldoDescricao;
    }

    public void OperacaoSaque(double saque){
        double novoSaldo = this.getSaldo() - saque;
        double novoCarteira = this.getCarteira() - saque;
        this.setCarteira(novoCarteira);
        this.setSaldo(novoSaldo);
        this.getSaldo();
    }

    public void OperacaoTransferencia(Conta conta, double transferencia){
        double novaTransferencia = conta.getSaldo() - transferencia;
        conta.setSaldo(novaTransferencia);
    }

    public void OperacaoDeposito(Conta conta, double deposito){
        double novoDeposito = conta.getSaldo() + deposito;
        conta.setSaldo(novoDeposito);
    }


    public void OperacaoEmprestimo(double emprestimo){

    }

    public void OperacaoInvestimento(Conta conta, double valorInvestido){
        
    }

    public String OperacaoHistorico(String data){
        return "";
    }
}
