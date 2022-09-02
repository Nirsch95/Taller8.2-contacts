package com.sofka.domain;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import java.io.Serializable;

@Data
@Entity
@Table(name="contacts")
public class Contact implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cont_id")
    private Long id;

    @Column(name = "cont_name")
    private String name;

    @Column(name = "cont_cell")
    private String cell;

    @Column(name = "cont_dateBirth")
    private String dateBirth;

    @Column(name = "cont_dateCreate")
    private String dateCreate;

    @Column(name = "cont_dateDelete")
    private String dateDelete;
}
