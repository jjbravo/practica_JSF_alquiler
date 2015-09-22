/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.example.jpa.emtity.Usuario;
import java.util.List;
import javax.persistence.criteria.CriteriaQuery;
/**
 *
 * @author USUARIO7
 */
@Stateless
public class UsuarioSessions {
    @PersistenceContext
     private EntityManager entityManager;
    
    public void create(Usuario usuario){
        entityManager.persist(usuario);
        
    }
    public List<Usuario> findAll(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Usuario.class));
        return entityManager.createQuery(cq).getResultList();
    }
    
    public void Edit(Usuario usuario){
        entityManager.merge(usuario);
    }
    public void remove(Usuario usuario){
        entityManager.remove(usuario);
    }
}
