/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author ETM-00168
 */
public class Usuario {
     //Atributos
    private int id;
    private PerfilUsuario perfil;
    private String nomeUsuario;
    private String email;
    private String senha;
    private String ultimoLogin;
    private Boolean ativo;

    //metodo costrutor
    public Usuario(int id, PerfilUsuario perfil, String nomeUsuario, String email, String senha) {
        this.id = id;
        this.perfil = perfil;
        this.nomeUsuario = nomeUsuario;
        this.email = email;
        this.senha = senha;
        //pega a data e horario e formata
        LocalDateTime login = LocalDateTime.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = login.format(formatar);
        
        this.ultimoLogin = dataFormatada;
        this.ativo = true;
        
    }
    @Override
    //metodo toString
    public String toString(){
        return "Usuario: " + "ID - " + id + "\n" + perfil + "|| " +
                "nomeUsuario - " + nomeUsuario + ", " +
                "Email - " + email + ", " +
                "Senha - " + senha + ", " +
                "UltimoLoguin - " + ultimoLogin + 
                " Ativo - " + this.ativo;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PerfilUsuario getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilUsuario perfil) {
        this.perfil = perfil;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUltimoLogin() {
        return ultimoLogin;
    }

    public void setUltimoLogin(String ultimoLogin) {
        this.ultimoLogin = ultimoLogin;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
    
    
}
