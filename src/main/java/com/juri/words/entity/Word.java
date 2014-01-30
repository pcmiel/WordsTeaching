package com.juri.words.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

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
    
    @Column(name="LAST_QUESTION_DATE", nullable = false)
    private Date lastQuestionDate;

    @Column(name="QUESTION_NUMBER", nullable = false)
    private Integer questionNumber;

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="WORD_ID")
    private Set<Question> questions;

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Integer getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(Integer questionNumber) {
        this.questionNumber = questionNumber;
    }

    public Date getLastQuestionDate() {
        return lastQuestionDate;
    }

    public void setLastQuestionDate(Date lastQuestionDate) {
        this.lastQuestionDate = lastQuestionDate;
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
