    package com.juri.words.controller;

import com.juri.words.entity.Word;
import com.juri.words.facade.WordFacade;

import com.juri.words.form.WordForm;
import com.juri.words.util.InformationGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

/**
 * User: cmiel
 * Date: 04.01.14
 */
@Controller
public class WordsController {

    @Autowired
    private WordFacade wordFacade;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public ModelAndView  showMainView(@ModelAttribute("changepassword")String info) {
        ModelAndView mv = new ModelAndView("index");
        return mv;
    }

    @ModelAttribute("index")
    public WordForm getWordForm() {
        return new WordForm();
    }

    @Transactional
    @RequestMapping(value = "index", method = RequestMethod.POST)
    public ModelAndView processAddWord(@ModelAttribute("index") WordForm form) {
        ModelAndView mv = new ModelAndView("index");
        Word word = new Word();
        word.setOryginal(form.getOryginal());
        word.setForeignWord(form.getForeignWord());
        word.setKnowValue(0);
        wordFacade.create(word);
        form.setOryginal("");
        form.setForeignWord("");
        mv.addObject("info", InformationGenerator.wordAdded(word));
        return mv;
    }

    @Transactional
    @RequestMapping(value = "allwords", method = RequestMethod.GET)
    public String showAllWords(Map<String, Object> model) {
        List<Word> words = wordFacade.findAll();
        model.put("words", words);
        return "allwords";
    }

}