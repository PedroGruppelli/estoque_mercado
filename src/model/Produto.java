/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


/**
 *
 * @author Pedro
 */
public class Produto {
// atributos
    private String nome;
    private int quant;
    private int estoqueMin;
    private int valorCompra;
    private int valorVenda;
    
    //Construtor
    public Produto(String nome, int quant, int estoqueMin, int valorCompra, int valorVenda) {
        this.nome = nome;
        this.quant = quant;
        this.estoqueMin = estoqueMin;
        this.valorCompra = valorCompra;
        this.valorVenda = valorVenda;
    }
    
    
    // metodos getset

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(int valorCompra) {
        this.valorCompra = valorCompra;
    }

    public int getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(int valorVenda) {
        this.valorVenda = valorVenda;
    }
    
    
}
