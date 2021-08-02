/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Cliente;

/**
 *
 * @author Aluno
 */
public class ClienteData extends Conexao {

   public ClienteData() throws Exception {
    }

    public boolean incluir(Cliente obj) throws Exception {
        String sql = "insert into tbl_cliente(nome_cliente,telefone,endereco) values(?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomeCliente());
        ps.setString(2, obj.getTelefone());
        ps.setString(3, obj.getEndereco());
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Cliente> pesquisar(String pesq) throws Exception {
        ArrayList<Cliente> listaclientes = new ArrayList<>();
        String sql = "Select * from tbl_cliente where nome_cliente like '" + pesq + "%' order by nome_cliente";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Cliente obj = new Cliente(rs.getInt("id_cliente"), rs.getString("nome_cliente"), rs.getString("telefone"), rs.getString("endereco"));
            listaclientes.add(obj);
        }
        return listaclientes;
    }

    public boolean excluir(int id) throws Exception {
        String sql = "Delete from tbl_cliente where id_cliente=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    public boolean editar(Cliente obj) throws Exception {
        String sql = "Update tbl_cliente set nome_cliente=?,telefone=?,endereco=? where id_cliente=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomeCliente());
        ps.setString(2, obj.getTelefone());
        ps.setString(3, obj.getEndereco());
        ps.setInt(4, obj.getIdCliente());
        return ps.executeUpdate() > 0;
    }

}
