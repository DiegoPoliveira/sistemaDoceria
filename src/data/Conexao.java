/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {

    private final Connection con;

    public Connection getConexao() {
        return con;
    }

    public Conexao() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/database?user=postgres&password=postgres";
        String driver = "org.postgresql.Driver";
        Class.forName(driver);
        con = DriverManager.getConnection(url);
    }
}
