package Operacao;

import java.sql.Date;

public abstract class Transacao{
    private String codigoTransacao;
    private Date dataTransacao;
    private Date horaTransacao;
    private double valor;
    private double taxa;
    private int numeroTransacao;
    private String descricao;

    public Transacao(String codigoTransacao, Date dataTransacao, Date horaTransacao, double valor, double taxa,
            int numeroTransacao, String descricao) {
        this.setCodigoTransacao(codigoTransacao);
        this.setDataTransacao(dataTransacao);
        this.setHoraTransacao(horaTransacao);
        this.setValor(valor);
        this.setTaxa(taxa);
        this.setNumeroTransacao(numeroTransacao);
        this.setDescricao(descricao);
    }

    public String getCodigoTransacao() {
        return codigoTransacao;
    }
    public void setCodigoTransacao(String codigoTransacao) {
        this.codigoTransacao = codigoTransacao;
    }

    public Date getDataTransacao() {
        return dataTransacao;
    }
    public void setDataTransacao(Date dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public Date getHoraTransacao() {
        return horaTransacao;
    }
    public void setHoraTransacao(Date horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getTaxa() {
        return taxa;
    }
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public int getNumeroTransacao() {
        return numeroTransacao;
    }
    public void setNumeroTransacao(int numeroTransacao) {
        this.numeroTransacao = numeroTransacao;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String gerarCode(){
        String[] caractere = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", ",", ".", "~", "]", "[", "(", ")", "'", "!", "@", "#", "$", "%", "¨", "&", "*", "-", "=", "+", "_","/", "?", "°", ";", ":", "º", "ª", "´", "^", "¹", "²", "³", "£", "¢", "¬", "\\", "|"};
        return "";
    }

    @Override
    public String toString() {
        return "Transacao [codigoTransacao=" + codigoTransacao + ", dataTransacao=" + dataTransacao + ", horaTransacao="
                + horaTransacao + ", valor=" + valor + ", taxa=" + taxa + ", numeroTransacao=" + numeroTransacao
                + ", descricao=" + descricao + "]";
    }   
}