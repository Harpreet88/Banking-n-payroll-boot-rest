package com.cg.banking.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cg.banking.beans.Account;

public class URIController {
	 private Account account;
	 @RequestMapping("/")
	 	public String getIndexPage() {
	 		
	 		return "indexPage";
	 	}
	 	
	 	@RequestMapping("/OpenAccount")
	 	public String getRegistrationPage() {
	 		
	 		return "bankingOpenAccount";
	 	}
	 	
	 	@RequestMapping("/DepositMoney")
	 	public String getDepositAmount() {
	 		
	 		return "bankingDepositMoney";
	 	}
	 	
	 	@RequestMapping("/WithdrawMoney")
	 	public String getWithdrawAmount() {
	 		
	 		return "bankingDepositMoney";
	 	}
	 	@ModelAttribute
	 	public Account getOpenAccount() {
	 		account=new Account();
	 		return account;
	 	}

}
