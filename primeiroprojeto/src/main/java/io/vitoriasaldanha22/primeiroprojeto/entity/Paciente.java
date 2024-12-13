package io.vitoriasaldanha22.primeiroprojeto.entity;

import jakarta.persistence.*;

 import java.time.LocalDate;

@Entity
public class Paciente {

    @Id
    private String id;

    @Column
    private String plano;

    @Column
    private String codigo;



    public Paciente() {
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlano() {
        return plano;
    }

    public void setPlano(String plano) {
        this.plano = plano;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


}







