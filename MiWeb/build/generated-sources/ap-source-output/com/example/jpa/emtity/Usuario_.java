package com.example.jpa.emtity;

import com.example.jpa.emtity.Apartamentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-22T17:54:08")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile SingularAttribute<Usuario, String> apellidos;
    public static volatile SingularAttribute<Usuario, Boolean> ocupado;
    public static volatile SingularAttribute<Usuario, String> documento;
    public static volatile SingularAttribute<Usuario, Integer> idUsuarios;
    public static volatile SingularAttribute<Usuario, Apartamentos> idApartamentos;
    public static volatile SingularAttribute<Usuario, String> nombres;

}