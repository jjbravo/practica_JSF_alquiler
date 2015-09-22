/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.emtity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author USUARIO7
 */
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {

    @Id
    @Column(name="idusuarios")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuarios;
    //@Column(name="documento")
    private String documento;
    //@Column(name="nombres")
    private String nombres;
    //@Column(name="apellidos")
    private String apellidos;
    
    private boolean ocupado;
    
    @JoinColumn(name="idapartamentos",referencedColumnName="idapartamentos")
    @ManyToOne(optional=false)
    private Apartamentos idApartamentos;

    public int getIdUsuarios() {
        return idUsuarios;
    }

    public void setIdUsuarios(int idUsuarios) {
        this.idUsuarios = idUsuarios;
    }
    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado=ocupado;
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

    public Apartamentos getIdApartamento() {
        return idApartamentos;
    }

    public void setIdApartamento(Apartamentos idApartamento) {
        this.idApartamentos = idApartamento;
    }

    @Override
    public String toString() {
        if(ocupado == true){
            return "Ocupado";
        } else {
            return "Desocupado";
        }
    }
    
    
}




























