package Main;

import Conta.Conta;

public class TerminalEletronico{
    public static void main(String[] args) {
        Conta ct = new Conta(118, "1234-5", "000186484-F","Dinossauro Bank", 0.0);
        ct.OperacaoImpressaoSaldo();
    }
}