package com.juri.words.util;

import com.juri.words.entity.Word;
import com.juri.words.form.WordForm;

/**
 * User: cmiel
 * Date: 14.01.14
 */
public class InformationGenerator {
    public static String wordAdded(Word word) {
        String info = "Added " + word.getForeignWord() + " - " + word.getOryginal();
        return info;
    }
}
