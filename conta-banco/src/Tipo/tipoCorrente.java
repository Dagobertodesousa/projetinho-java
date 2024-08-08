package Tipo;
import Pessoa.Titular;

public abstract class tipoCorrente extends Tipo{
    private Titular titular;
    private int banco;
    private String agencia;
    private String conta;

    public tipoCorrente(Titular titular, int banco, String agencia, String conta) {
        this.setTitular(titular);
        this.setBanco(banco);
        this.setAgencia(agencia);
        this.setConta(conta);
    }
    public Titular getTitular() {
        return titular;
    }
    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    public int getBanco() {
        return banco;
    }
    public void setBanco(int banco) {
        this.banco = banco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
}
