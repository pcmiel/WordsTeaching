package com.juri.words.util;

import com.juri.words.entity.Word;
import com.juri.words.form.WordForm;

/**
 * User: cmiel
 * Date: 14.01.14
 */
public class InformationGenerator {
    public static String wordAddedCorectly() {
        String info = "Added new word";
        return info;
    }
    
    public static String wordToShort(){
        return "Minimal length of word is 1. Word not added";
    }
}
