/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author PC
 */
public class ProdutoData extends Conexao {
       public ProdutoData() throws Exception {
    }

    public boolean incluir(Produto obj) throws Exception {
        String sql = "insert into tbl_produto(nome_produto,custo_produto,qtd_produto) values(?,?,?)";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomeProduto());
        ps.setDouble(2, obj.getCustoProduto());
        ps.setInt(3, obj.getQtdProduto());
        return ps.executeUpdate() > 0;
    }

    public ArrayList<Produto> pesquisar(String pesq) throws Exception {
        ArrayList<Produto> listaprodutos = new ArrayList<>();
        String sql = "Select * from tbl_produto where nome_produto like '" + pesq + "%' order by nome_produto";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Produto obj = new Produto(rs.getInt("id_produto"), rs.getString("nome_produto"), rs.getFloat("custo_produto"), rs.getInt("qtd_produto"));
            listaprodutos.add(obj);
        }
        return listaprodutos;
    }

    public boolean excluir(int id) throws Exception {
        String sql = "Delete from tbl_produto where id_produto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setInt(1, id);
        return ps.executeUpdate() > 0;
    }

    public boolean editar(Produto obj) throws Exception {
        String sql = "Update tbl_produto set nome_produto=?,custo_produto=?,qtd_produto=? where id_produto=?";
        PreparedStatement ps = getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNomeProduto());
        ps.setDouble(2, obj.getCustoProduto());
        ps.setInt(3, obj.getQtdProduto());
        ps.setInt(4, obj.getIdProduto());
        return ps.executeUpdate() > 0;
    }

}
