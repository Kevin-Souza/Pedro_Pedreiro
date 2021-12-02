package br.com.pedropedreiro.rdn;


import java.sql.Connection;
import java.sql.SQLException;

public class Principal {
    public static void main (String[] args) throws SQLException{
        // ----- Testar Cliente
        //TESTAR CONEXÃO -- Deixar comentado
            Connection conn = (Connection) new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta");
            conn.close();
    }
}
