/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Pedro
 */
public class Cliente {
        
    //declarando atributos
    private String nome;
    private int Cpf;
    private Date data;

    //=== construtor ===
    public Cliente(String nome, int Cpf, Date data) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.data = data;
    }
    
    
    //=== GETERS AND SETTERS ===

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (this.getNome().length() < 3 || this.getNome().length() > 20) {
           
       } 
     this.nome = nome;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
        
    

    
}
