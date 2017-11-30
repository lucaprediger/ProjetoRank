/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projetorank.Modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 *
 * @author ALUNO
 */
@Entity
@Table(name = "TB_PESSOA")
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "PES_ID")
    private Integer ID;

    @Column(name = "PES_NOME", length = 100, nullable = true)
    private String nome;
    @Column(name = "RA", nullable = true)
    private Integer RA;

    @OneToOne(mappedBy = "Pessoa")
    @OnDelete(action = OnDeleteAction.CASCADE) //relacionamento usuario
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Universidade universidade;
}