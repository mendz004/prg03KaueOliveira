/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade08.classe;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author ETM-00168
 */
public class Main {
    
    public static void main(String[] args) {
        List<String> permissoesComum = Arrays.asList(
        "Criar Usuario");
    List<String> permissoesADM = Arrays.asList(
    "Criar Usuario", "Alterar Senha", "Excluir Usurio");
    
    //perfil de usurio comum e usurio administrador
    PerfilUsuario perfilComum = new PerfilUsuario(1, "Usuario Comum", permissoesComum);
    PerfilUsuario perfilADM = new PerfilUsuario(2, "Usuario ADM", permissoesADM);
    
    //usuario comum e administrador
    Usuario usuarioComum = new Usuario(1, perfilComum, "Kaue oliveira", "KaueMendz@gmail.com", "K0K0K0");
    Usuario usuarioADM = new Usuario(2, perfilADM, "Mendz", "Mendz@gmail.com", "168731");
    
    //logs para usuario Comum e ADM
    LogAuditoria log01 = new LogAuditoria(1, usuarioComum, "Tentativa de login", "192.158.1.38");
    LogAuditoria log02 = new LogAuditoria(2, usuarioADM, "Alterar Senha", "171.1356.1.39");
    
    //logs para usuario Comum e ADM
    Sessao sessao01 = new Sessao(1, usuarioComum, "JWT");
    Sessao sessao02 = new Sessao(2, usuarioADM, "JWT");
    
       
    }
}
