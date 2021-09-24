package br.com.pedropedreiro.modelo;

import java.util.Date;

public class Funcionario extends Pessoa{
    // ========== Atributos
    private String salario;
    private String pis;

    // ========== Construtor
    public Funcionario(String pNome,  String pDocumento){
        super(pNome, pDocumento);
    };

    public Funcionario(String pNome, String pTelefone, String pDocumento, Date pDataNascimento, Endereco pEndereco){
        super(pNome, pTelefone, pDocumento, pDataNascimento, pEndereco);
    };

    // ========== Gets e Sets
    // ===== Salário
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    // ===== Pis
    public String getPis() {
        return pis;
    }
    public void setPis(String pis) {
        this.pis = pis;
    }
}
