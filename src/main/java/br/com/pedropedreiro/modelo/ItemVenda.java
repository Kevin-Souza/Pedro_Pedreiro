package br.com.pedropedreiro.modelo;

public class ItemVenda {
    // ========== Atributos
    private Produto produto;
    private double qtd;
    private double subTotal;

    // ========== Gets e Sets
    // ===== Produto
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    // ===== Quantidade
    public double getQtd() {
        return qtd;
    }
    public void setQtd(double qtd) {
        this.qtd = qtd;
    }

    // ===== SubTotal
    public double getSubTotal() {
        return subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}
