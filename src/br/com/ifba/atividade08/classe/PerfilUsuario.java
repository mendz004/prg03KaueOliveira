/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

import java.util.List;

/**
 *
 * @author ETM-00168
 */
public class PerfilUsuario {
     //Atributos
    private int id;
    private String descricao;
    private List<String> permissoes;

    //metodo costrutor
    public PerfilUsuario(int id, String descricao, List<String> permissoes) {
        this.id = id;
        this.descricao = descricao;
        this.permissoes = permissoes;
    }
    @Override
     //metodo toString
    public String toString(){
    return "Perfil do Usuario:" + " id - "+ id + "," + 
            " descricao - "+ descricao + "," +
            " permissoes - "+ permissoes + "";
    
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<String> permissoes) {
        this.permissoes = permissoes;
    }
    
    
}
