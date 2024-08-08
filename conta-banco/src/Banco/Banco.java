package Banco;
import Tipo.Tipo;
import Conta.Conta;

public abstract class Banco {
    private String razaoSocial;
    private int registroBanco;
    private String agencia;
    private Conta conta;
    private Tipo tipo;
    
    public Banco(String razaoSocial, int registroBanco, String agencia, Conta conta, Tipo tipo) {
        this.setRazaoSocial(razaoSocial);
        this.setRegistroBanco(registroBanco);
        this.setAgencia(agencia);
        this.setConta(conta);
        this.setTipo(tipo);
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public int getRegistroBanco() {
        return registroBanco;
    }
    public void setRegistroBanco(int registroBanco) {
        this.registroBanco = registroBanco;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public Conta getConta() {
        return conta;
    }
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    @Override
    public String toString() {
        return "Banco [razaoSocial=" + razaoSocial + ", registroBanco=" + registroBanco + ", agencia=" + agencia
                + ", conta=" + conta + ", tipo=" + tipo + "]";
    }

    
}
