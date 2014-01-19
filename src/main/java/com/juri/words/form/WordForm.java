package com.juri.words.form;

import java.io.Serializable;

/**
 * User: cmiel
 * Date: 11.01.14
 */
public class WordForm implements Serializable {
    private String oryginal;
    private String foreignWord;
    private Integer knowVal;
    private Long ID;

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getOryginal() {
        return oryginal;
    }

    public void setOryginal(String oryginal) {
        this.oryginal = oryginal;
    }

    public String getForeignWord() {
        return foreignWord;
    }

    public void setForeignWord(String foreignWord) {
        this.foreignWord = foreignWord;
    }

    public Integer getKnowVal() {
        return knowVal;
    }

    public void setKnowVal(Integer knowVal) {
        this.knowVal = knowVal;
    }
}
