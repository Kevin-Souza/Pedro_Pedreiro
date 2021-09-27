package br.com.pedropedreiro.modelo;

public class ItemVenda {
    // ========== Atributos
    private Produto produto;
    private double qtd;
    private double subTotal;

    public ItemVenda(Produto produto, double qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

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
        double subTotal = this.produto.getPrecoVenda()*qtd;
        this.subTotal = subTotal;
        return this.subTotal;
    }
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }


}
