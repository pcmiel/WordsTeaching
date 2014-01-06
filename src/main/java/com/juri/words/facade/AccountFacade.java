package com.juri.words.facade;
import com.juri.words.entity.Account;

import org.springframework.stereotype.Repository;
/**
 * Created with IntelliJ IDEA.
 * User: cmiel
 * Date: 04.01.14
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AccountFacade extends AbstractFacade<Account> {

    public AccountFacade() {
        super(Account.class);
    }             
}
