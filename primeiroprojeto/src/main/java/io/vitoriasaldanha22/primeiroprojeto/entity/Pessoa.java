package io.vitoriasaldanha22.primeiroprojeto.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Pessoa {

    @Id
    private String id;

    @Column( name = "nome")
    private String nome; // quando a váriavel for diferente da coluna do banco deve se usar parentes referenciando o nome da váriavel na tabela

    @Column
    private String cpf;

    @Column
    private LocalDate dataNasc;

    @Column
    private String sexo;


    // váriaveis com á inicial maiuscula herdaram o tipo objeto

    //definindo uma váriavel para á entidade pessoa

    @OneToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }


    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Pessoa() {

    }
}
