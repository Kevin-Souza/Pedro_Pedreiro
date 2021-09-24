package br.com.pedropedreiro.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Venda {
    // ========== Atributos
    private int id;
    private String notaFiscal;
    private Date dataVenda;
    private Cliente cliente;
    private double valorVenda;
    private Funcionario funcionario;
    private ArrayList<ItemVenda> itens;

    // ========== Gets e Sets
    // ===== ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    // ===== Nota Fiscal
    public String getNotaFiscal() {
        return notaFiscal;
    }
    public void setNotaFiscal(String notaFiscal) {
        this.notaFiscal = notaFiscal;
    }

    // ===== Data Venda
    public Date getDataVenda() {
        return dataVenda;
    }
    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    // ===== Cliente
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    // ===== Valor Venda
    public double getValorVenda() {
        return valorVenda;
    }
    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    // ===== Funcionário
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    // ===== Item Venda
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
}
