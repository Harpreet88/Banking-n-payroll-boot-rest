package com.cg.banking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.banking.beans.Account;
import com.cg.banking.services.BankingServices;

public class BankingServiceController {
	@Autowired
	BankingServices bankingServices;

	
	@RequestMapping("/registerAssociate")
	public ModelAndView registerAssociate(@ModelAttribute Account account) {
		account =bankingServices.openAccount(account);
		return new ModelAndView("openAccountSuccess","account",account);
	}
	
	@RequestMapping("/bankingDepositMoney2")
	public ModelAndView depositMoney(@ModelAttribute Account account) {
		//account =bankingServices.depositAmount(accountNo, amount);
		return new ModelAndView("openAccountSuccess","account",account);
	}

}
