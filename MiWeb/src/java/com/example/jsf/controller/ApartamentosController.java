/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jsf.controller;

import com.example.jpa.emtity.Apartamentos;
import com.example.jpa.sessions.ApartamentoSessions;
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
public class ApartamentosController implements Serializable {
    @EJB
    private ApartamentoSessions apartamentoSession;
    private Apartamentos selectedApartamentos;
    private List<Apartamentos> itemsApartamentos=null;
    private int idApartamentos;
    private String numApartamento;
    private String nombreApartamento;
  
    public ApartamentosController(){
        
    }

    public ApartamentoSessions getApartamentoSession() {
        return apartamentoSession;
    }

    public void setApartamentoSession(ApartamentoSessions apartamentoSession) {
        this.apartamentoSession = apartamentoSession;
    }

    public Apartamentos getSelectedApartamentos() {
        if(selectedApartamentos == null){
            selectedApartamentos = new Apartamentos();
        }
        return selectedApartamentos;
    }

    public void setSelectedApartamentos(Apartamentos selectedApartamentos) {
        this.selectedApartamentos = selectedApartamentos;
    }

    public List<Apartamentos> getItemsApartamentos() {
        if(itemsApartamentos == null){
            try{
                itemsApartamentos=getApartamentoSession().findAll();
            }catch(Exception ex){
                System.err.println(ex.getMessage());
            }
        }
        return itemsApartamentos;
    }

    public void setItemsApartamentos(List<Apartamentos> itemsApartamentos) {
        this.itemsApartamentos = itemsApartamentos;
    }

    public int getIdApartamentos() {
        return idApartamentos;
    }

    public void setIdApartamentos(int idApartamentos) {
        this.idApartamentos = idApartamentos;
    }

    public String getNumApartamento() {
        return numApartamento;
    }

    public void setNumApartamento(String numApartamento) {
        this.numApartamento = numApartamento;
    }

    public String getNombreApartamento() {
        return nombreApartamento;
    }

    public void setNombreApartamento(String nombreApartamento) {
        this.nombreApartamento = nombreApartamento;
    }
    public void create(){
        try{
            getApartamentoSession().create(selectedApartamentos);
        }catch(Exception ex){
            System.err.println(ex.getMessage());
        }
    }
}





























