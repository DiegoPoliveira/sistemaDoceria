/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author PC
 */
public class Produto {
    private int idProduto;
    private String nomeProduto;
    private double custoProduto;
    private int qtdProduto;

    public Produto() {
        idProduto = 0;
        nomeProduto = new String();
        custoProduto = 0;
        qtdProduto = 0;
    }

    public Produto(int idProduto, String nomeProduto, double custoProduto, int qtdProduto) {
        this.idProduto = idProduto;
        this.nomeProduto = nomeProduto;
        this.custoProduto = custoProduto;
        this.qtdProduto = qtdProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(double custoProduto) {
        this.custoProduto = custoProduto;
    }

    public int getQtdProduto() {
        return qtdProduto;
    }

    public void setQtdProduto(int qtdProduto) {
        this.qtdProduto = qtdProduto;
    }
    
    
}
