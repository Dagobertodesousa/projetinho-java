package Banco;
import Tipo.Tipo;

public abstract class Banco {
    private String razaoSocial;
    private int registroBanco;
    private String agencia;
    private String conta;
    private Tipo tipo;
    
    public Banco(String razaoSocial, int registroBanco, String agencia, String conta, Tipo tipo) {
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
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    
}
