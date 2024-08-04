package Pessoa;

public class Titular {
    private String nomeCompleto;
    private boolean titular;
    private boolean dependente;
    private String cep;
    private String logradouro;
    private String bairro;
    private int numero;
    private int telefone;

    
    public Titular(String nomeCompleto, boolean titular, boolean dependente, String cep, String logradouro,
            String bairro, int numero, int telefone) {
        this.setNomeCompleto(nomeCompleto);
        this.setTitular(titular);
        this.setDependente(dependente);
        this.setCep(cep);
        this.setLogradouro(logradouro);
        this.setBairro(bairro);
        this.setNumero(numero);
        this.setTelefone(telefone);
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public boolean isTitular() {
        return titular;
    }
    public void setTitular(boolean titular) {
        this.titular = titular;
    }
    public boolean isDependente() {
        return dependente;
    }
    public void setDependente(boolean dependente) {
        this.dependente = dependente;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    
}
