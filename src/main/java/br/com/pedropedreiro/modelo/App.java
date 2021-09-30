package br.com.pedropedreiro.modelo;

import java.util.ArrayList;
import java.util.Date;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("=========================");
        System.out.println( "     Pedro Pedreiro     ");
        System.out.println("Materiais para Construção");
        System.out.println("=========================");

        //Cliente
        Date dtNascimento = new Date();

        Endereco end = new Endereco("Rua Altair Passos Dias Aguiar","Jardim do taxista",
                "55850-000","Lagoa Azul","Na rua onde encontraram a bota de Judas","333","AC");

        Cliente cliente = new Cliente("João", "658.679.859-49","888.767.250-00",dtNascimento,end,"77757778");

        //Funcionário
        Funcionario funcionario = new Funcionario("Denys","333.444.222-55");

        //Produto cimento
        Fornecedor fornecedorCasadoCimento = new Fornecedor("CasadoCimento", "111.345.743-22");
        Fornecedor fornecedorCimen = new Fornecedor("Cimen", "443.111.623-77");

        ArrayList<Fornecedor> lstFornecedorCimento = new ArrayList<Fornecedor>();
        lstFornecedorCimento.add(fornecedorCasadoCimento);
        lstFornecedorCimento.add(fornecedorCimen);

        Produto produtoCimento = new Produto("Cimento 50Kg", "Saco de Cimento 50KG", "Saco de Cimento 50KG para uma massa mais forte","Taca massa no muro", 25, 41,100,lstFornecedorCimento);

        //Produto tijolo
        Fornecedor fornecedorTijolar = new Fornecedor("Tijolar", "505.422.676-15");
        Fornecedor fornecedorParede = new Fornecedor("Parede", "424.757.171-66");

        ArrayList<Fornecedor> lstFornecedorTijolo = new ArrayList<Fornecedor>();
        lstFornecedorTijolo.add(fornecedorTijolar);
        lstFornecedorTijolo.add(fornecedorParede);

        Produto produtoTijolo = new Produto("Tijolo", "Tijolo de barro", "Tijolo fabricado com o mais puro barro do córrego triste","Tijolinho", 2.10, 3,5000,lstFornecedorTijolo);


        //itens da venda
        ItemVenda iCimento = new ItemVenda(produtoCimento, 5);
        ItemVenda iTijolo = new ItemVenda(produtoTijolo, 300);

        // Venda
        ArrayList<ItemVenda> itens = new ArrayList<>();
        itens.add(iCimento);
        itens.add(iTijolo);

        Date dataVenda = new Date(2021,9,26);
        Venda venda = new Venda("555777",dataVenda,cliente,150,funcionario,itens);

        venda.imprimirResumo();
    }
}
