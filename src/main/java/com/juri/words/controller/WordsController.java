package com.juri.words.controller;

import com.juri.words.entity.Word;
import com.juri.words.facade.WordFacade;

import com.juri.words.form.WordForm;
import com.juri.words.util.InformationGenerator;
import com.juri.words.util.Tools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * User: cmiel
 * Date: 04.01.14
 */
@Controller
public class WordsController {

    @Autowired
    private WordFacade wordFacade;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView showMainView(@ModelAttribute("changepassword") String info) {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @ModelAttribute("index")
    public WordForm getWordForm() {
        return new WordForm();
    }

    @Transactional
    @RequestMapping(value = "index", method = RequestMethod.POST)
    public ModelAndView addWord(@ModelAttribute("index") WordForm form) {
        ModelAndView mv = new ModelAndView("index");
        String info;
        if (Tools.isNullOrEmpty(form.getOryginal()) || Tools.isNullOrEmpty(form.getForeignWord())) {
            info = InformationGenerator.wordToShort();
        } else {
            Word word = new Word();
            word.setOryginal(form.getOryginal());
            word.setForeignWord(form.getForeignWord());
            word.setKnowValue(0);
            word.setQuestionNumber(6);
            word.setLastQuestionDate(new Date());
            
            wordFacade.create(word);
            form.setOryginal("");
            form.setForeignWord("");
            info = InformationGenerator.wordAddedCorectly();
        }
        mv.addObject("info", info);
        return mv;
    }

    @Transactional
    @RequestMapping(value = "allwords", method = RequestMethod.GET)
    public String showAllWords(Map<String, Object> model) {
        List<Word> words = wordFacade.findAll();
        model.put("words", words);
        return "allwords";
    }

    @Transactional
    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    public ModelAndView preEditWord(@ModelAttribute WordForm wordForm, @PathVariable Long id) {
        Word word = wordFacade.find(id);
        wordForm.setKnowVal(word.getKnowValue());
        wordForm.setOryginal(word.getOryginal());
        wordForm.setForeignWord(word.getForeignWord());
        wordForm.setID(word.getId());
        ModelAndView mv = new ModelAndView("edit");
        return mv;
    }

    @ModelAttribute("edit")
    public WordForm editWordForm() {
        return new WordForm();
    }

    @RequestMapping(value="/edit", method=RequestMethod.POST)
    public ModelAndView editWord(@ModelAttribute("edit") WordForm wordForm) {
     Word toEdit = wordFacade.find(wordForm.getID());
       
        toEdit.setForeignWord(wordForm.getForeignWord());
        toEdit.setOryginal(wordForm.getOryginal());
        toEdit.setKnowValue(wordForm.getKnowVal());
        wordFacade.edit(toEdit);
        List<Word> words = wordFacade.findAll();
        ModelAndView mv = new ModelAndView("allwords", "words", words);
        return mv;
    }

    @Transactional
    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteWord(Map<String, Object> model, @PathVariable Long id) {
        Word toRemove = wordFacade.find(id);
        
        wordFacade.remove(toRemove);
        List<Word> words = wordFacade.findAll();
        model.put("words", words);
        ModelAndView mv = new ModelAndView("allwords");
        return mv;
    }

    @Transactional
    @RequestMapping(value = "question", method = RequestMethod.GET)
    public ModelAndView question(Map<String, Object> model) {
        List<Word> words = wordFacade.findAll();
        Random rand = new Random();
        int wordIndex = rand.nextInt(words.size());
        Word word = words.get(wordIndex);
        return new ModelAndView("question", "word", word);
    }

}