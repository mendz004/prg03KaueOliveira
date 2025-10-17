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
public class LogAuditoria {
    //Atributos
 private int id;
 private Usuario usuario;
 private String acao;
 private String dataHora;
 private String ip;

 //metodo costrutor
    public LogAuditoria(int id, Usuario usuario, String acao, String ip) {
        this.id = id;
        this.usuario = usuario;
        this.acao = acao;
        //pega a data e horario e formata
        LocalDateTime datahora = LocalDateTime.now();
        DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataFormatada = datahora.format(formatar);
        
        this.dataHora = dataFormatada;
        this.ip = ip;
        
    }

 @Override
  //metodo toString
    public String toString(){
        
        return "LogAuditoria: " + "ID - " + id 
                 + "\n" + usuario + "\n" + "Acao - "
                 + acao + " DataHora - " + dataHora +
                ", " + "IP - " + ip;
        
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

    public String getAcao() {
        return acao;
    }

    public void setAcao(String acao) {
        this.acao = acao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
 
 
}
