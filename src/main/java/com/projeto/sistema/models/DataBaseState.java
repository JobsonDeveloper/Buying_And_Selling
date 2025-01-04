package com.projeto.sistema.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity // Informar que é uma entidade do banco de dados
@Table(name = "state") // Informar o nome da entidade/tabela no banco de dados
public class DataBaseState implements Serializable {

    private static final Long serialVersionUID = 1L; // Criação automática de ID
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String acronym; // Sigla

    // GETTERS
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getAcronym() {
        return acronym;
    }

    // SETTERS
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }
}