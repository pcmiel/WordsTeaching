package com.juri.words.entity;

import javax.persistence.*;

/**
 * User: cmiel
 * Date: 11.01.14
 */
@Entity
@Table(name = "WORD")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Word  extends BaseEntity {
    
    @Column(name="ORYGINAL", nullable = false)
    private String oryginal;
    
    @Column(name="FOREIGN_WORD", nullable = false)
    private String foreignWord;
    
    @Column(name="KNOW_VALUE", nullable = false)
    private Integer knowValue;

    public String getOryginal() {
        return oryginal;
    }

    public void setOryginal(String oryginal) {
        this.oryginal = oryginal;
    }

    public String getForeignWord() {
        return foreignWord;
    }

    public void setForeignWord(String foreign) {
        this.foreignWord = foreign;
    }

    public Integer getKnowValue() {
        return knowValue;
    }

    public void setKnowValue(Integer knowValue) {
        this.knowValue = knowValue;
    }
}
