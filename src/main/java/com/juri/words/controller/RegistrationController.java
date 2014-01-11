package com.juri.words.controller;

import com.juri.words.entity.Word;
import com.juri.words.facade.WordFacade;

import com.juri.words.form.WordForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * User: cmiel
 * Date: 04.01.14
 */
@Controller
public class RegistrationController {

    @Autowired
    private WordFacade wordFacade;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showMainView() {
        return "index";
    }

    @ModelAttribute("index")
    public WordForm getWordForm() {
        return new WordForm();
    }

    @Transactional
    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String processAddWord(@ModelAttribute("index") WordForm form) {

        Word word = new Word();
        word.setOryginal(form.getOryginal());
        word.setForeignWord(form.getForeignWord());
        word.setKnowValue(0);
        wordFacade.create(word);

        return "index";
    }

    @Transactional
    @RequestMapping(value = "index/show-words", method = RequestMethod.GET)
    public String showAllWords(Map<String, Object> model) {
        List<Word> words = wordFacade.findAll();
        model.put("words", words);
        return "index";
    }

}