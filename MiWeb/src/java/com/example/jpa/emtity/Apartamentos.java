/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.emtity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author USUARIO7
 */
@Entity
@Table(name="apartamentos")
public class Apartamentos implements Serializable{
    @Id
    @Column(name="idapartamentos")
    private int idApartamentos;
    
    @Column(name="num_apartamento")
    private int numApartamento;
    
    @Column(name="nombre")
    private String nombre;
    
    @OneToMany(cascade = CascadeType.ALL,mappedBy="idApartamentos")
    private List<Usuario> listUsuario;
    
    public Apartamentos() {
        
    }
    public Apartamentos(int idApartamentos) {
        this.idApartamentos = idApartamentos;
    }

    public int getIdApartamentos() {
        return idApartamentos;
    }

    public void setIdApartamentos(int idApartamentos) {
        this.idApartamentos = idApartamentos;
    }

    public int getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(int numApartamento) {
        this.numApartamento = numApartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(List<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }
    
    
    
}





















