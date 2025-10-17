/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

/**
 *
 * @author ETM-00168
 */
public class Sessao {
     //Atributos
    private int id;
    private Usuario usuario;
    private String token;

    //metodo costrutor
    public Sessao(int id, Usuario usuario, String token) {
        this.id = id;
        this.usuario = usuario;
        this.token = token;
    }
    @Override
     //metodo toString
    public String toString(){
    return "Sessao: " + "ID - " + id + "\n" + usuario + "\n" +
            "Token - " + token;
    
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
    
}
