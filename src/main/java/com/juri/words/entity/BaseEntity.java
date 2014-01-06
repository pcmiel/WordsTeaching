package com.juri.words.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: cmiel
 * Date: 04.01.14
 * Time: 18:02
 * To change this template use File | Settings | File Templates.
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    public Long getId() {
        return id;
    }
}