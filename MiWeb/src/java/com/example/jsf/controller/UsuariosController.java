/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;
import com.example.jpa.emtity.Apartamentos;
import com.example.jpa.emtity.Usuario;
import com.example.jpa.sessions.UsuarioSessions;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
/**
 *
 * @author USUARIO7
 */
@ManagedBean
@ViewScoped
public class UsuariosController implements Serializable {
    @EJB
    private UsuarioSessions usuarioSession;
    
    private int idUsuario;
    private String documento;
    private String nombres;
    private String apellidos;
    private int idApartamento;
    private Usuario selectedUsuario;
    private boolean ocupado;
    private List<Usuario>itemsUsuario = null;
    
    public UsuariosController(){
        
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public UsuarioSessions getUsuarioSession() {
        return usuarioSession;
    }

    public void setUsuarioSession(UsuarioSessions usuarioSession) {
        this.usuarioSession = usuarioSession;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getIdApartamento() {
        return idApartamento;
    }

    public void setIdApartamento(int idApartamento) {
        this.idApartamento = idApartamento;
    }

    public Usuario getSelectedUsuario() {
        if(selectedUsuario==null){
            selectedUsuario= new Usuario();
        }
        return selectedUsuario;
    }

    public void setSelectedUsuario(Usuario selectedUsuario) {
        this.selectedUsuario = selectedUsuario;
    }

    public List<Usuario> getItemsUsuario() {
        if(itemsUsuario == null){
            try{
                itemsUsuario=getUsuarioSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsUsuario;
    }
    
    public void create(){
        try{
            System.out.println("Poraki voy");
            selectedUsuario.setIdApartamento(new Apartamentos(idApartamento));
            getUsuarioSession().create(selectedUsuario);
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
   
    
}





















