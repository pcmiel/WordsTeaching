package com.juri.words.controller;

import com.juri.words.entity.Account;
import com.juri.words.facade.AccountFacade;
import com.juri.words.form.RegistrationForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: cmiel
 * Date: 04.01.14
 * Time: 18:10
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class RegistrationController {

    @Autowired
    private AccountFacade accountFacade;

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String showMainView() {
        return "index";
    }

    @ModelAttribute("index")
    public RegistrationForm getRegistrationForm() {
        return new RegistrationForm();
    }

    @Transactional
    @RequestMapping(value = "index", method = RequestMethod.POST)
    public String processRegisterUser(@ModelAttribute("index") RegistrationForm form) {

        Account account = new Account();
        account.setName(form.getName());
        account.setEmail(form.getEmail());
        account.setUsername(form.getUsername());
        account.setPassword(form.getPassword());

        accountFacade.create(account);

        return "index";
    }

    @Transactional
    @RequestMapping(value = "index/show-users", method = RequestMethod.GET)
    public String showAllUsers(Map<String, Object> model) {
        List<Account> accounts = accountFacade.findAll();
        model.put("accounts", accounts);
        return "index";
    }

}