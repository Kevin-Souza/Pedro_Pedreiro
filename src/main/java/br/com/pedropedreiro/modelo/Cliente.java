package br.com.pedropedreiro.modelo;

import java.util.Date;

public class Cliente extends Pessoa{
    // ========== Atributos
    private String numeroCartaoFidelidade;

    // ========== Construtor
    public Cliente(String pNome,  String pDocumento){
        super(pNome, pDocumento);
    };

    public Cliente(String pNome, String pTelefone, String pDocumento, Date pDataNascimento, Endereco pEndereco, String pnumeroCartaoFidelidade){
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);
        this.numeroCartaoFidelidade = pnumeroCartaoFidelidade;
    };

    // ========== Get e Set
    // ===== Numero Cartão Fidelidade
    public String getNumeroCartaoFidelidade() {
        return numeroCartaoFidelidade;
    }
    public void setNumeroCartaoFidelidade(String numeroCartaoFidelidade) {
        this.numeroCartaoFidelidade = numeroCartaoFidelidade;
    }
}
