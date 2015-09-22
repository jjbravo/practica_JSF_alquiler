/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.jpa.sessions;
import com.example.jpa.emtity.Apartamentos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 *
 * @author USUARIO7
 */
@Stateless
public class ApartamentoSessions {
 @PersistenceContext
     private EntityManager entityManager;
    
    public void create(Apartamentos apartamentos){
        entityManager.persist(apartamentos);
        
    }
    public List<Apartamentos> findAll(){
        CriteriaQuery cq = entityManager.getCriteriaBuilder().createQuery();
        cq.select(cq.from(Apartamentos.class));
        return entityManager.createQuery(cq).getResultList();
    }
    
    public void Edit(Apartamentos apartamentos){
        entityManager.merge(apartamentos);
    }
    public void remove(Apartamentos apartamentos){
        entityManager.remove(apartamentos);
    }
}
