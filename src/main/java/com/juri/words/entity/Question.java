package com.juri.words.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * User: cmiel
 * Date: 25.01.14
 */

@Entity
@Table(name = "QUESTION")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Question extends BaseEntity {

    @Column(name="QUESTION_DATE", nullable = false)
    private Date questionDate;

    @Column(name="CORRECT_ANSWER", nullable = false)
    private Boolean correctAnswer;
    
    @ManyToOne
    private Word word;
    
    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }  

    public Date getQuestionDate() {
        return questionDate;
    }

    public void setQuestionDate(Date lastQuestionDate) {
        this.questionDate = lastQuestionDate;
    }

    public Boolean getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
