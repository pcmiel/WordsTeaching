package com.juri.words.facade;

import com.juri.words.entity.Word;
import org.springframework.stereotype.Repository;

/**
 * User: cmiel
 * Date: 11.01.14
 */
@Repository
public class WordFacade extends AbstractFacade<Word> {
    public WordFacade(){
        super(Word.class);
    }
}
