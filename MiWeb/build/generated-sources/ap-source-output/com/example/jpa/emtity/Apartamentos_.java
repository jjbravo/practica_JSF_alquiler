package com.example.jpa.emtity;

import com.example.jpa.emtity.Usuario;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-22T17:54:08")
@StaticMetamodel(Apartamentos.class)
public class Apartamentos_ { 

    public static volatile SingularAttribute<Apartamentos, String> nombre;
    public static volatile SingularAttribute<Apartamentos, Integer> idApartamentos;
    public static volatile ListAttribute<Apartamentos, Usuario> listUsuario;
    public static volatile SingularAttribute<Apartamentos, Integer> numApartamento;

}