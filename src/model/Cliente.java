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
    private String email;
    private String tel;

    //=== construtor ===
    public Cliente(String nome, int Cpf, Date data, String email, String tel) {
        this.nome = nome;
        this.Cpf = Cpf;
        this.data = data;
        this.email = email;
        this.tel = tel;
    }

    //=== GETERS AND SETTERS ===
    
    public String getEmail() {    
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

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
