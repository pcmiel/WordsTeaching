package com.juri.words.facade;

import com.juri.words.entity.Question;
import org.springframework.stereotype.Repository;

/**
 * User: cmiel
 * Date: 11.01.14
 */
@Repository
public class QuestionFacade extends AbstractFacade<Question> {
    public QuestionFacade() {
        super(Question.class);
    }
}
