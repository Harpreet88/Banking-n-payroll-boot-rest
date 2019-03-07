package com.cg.banking.aspect;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cg.banking.exceptions.AccountBlockedException;
import com.cg.banking.exceptions.AccountNotFoundException;
import com.cg.banking.exceptions.BankingServicesDownException;
import com.cg.banking.exceptions.InsufficientAmountException;
import com.cg.banking.exceptions.InvalidAccountTypeException;
import com.cg.banking.exceptions.InvalidAmountException;
import com.cg.banking.exceptions.InvalidPinNumberException;

public class BankingExceptionAspect {
	@ExceptionHandler(BankingServicesDownException.class)
	public ModelAndView handleBankingServicesDownException(Exception e) {
		return new ModelAndView("bankingOpenAccount","errorMessage",e.getMessage());
		
	}
	
	@ExceptionHandler(AccountBlockedException.class)
	public ModelAndView handleAccountBlockedException(Exception e) {
		return new ModelAndView("bankingFundTransfer","errorMessage",e.getMessage());
		
	}
	
	@ExceptionHandler(AccountNotFoundException.class)
	public ModelAndView handleAccountNotFoundException(Exception e) {
		return new ModelAndView("bankingAccountDetail","errorMessage",e.getMessage());
		
	}
	@ExceptionHandler(InsufficientAmountException.class)
	public ModelAndView handleInsufficientAmountException(Exception e) {
		return new ModelAndView("bankingWithdrawMoney","errorMessage",e.getMessage());
		
	}
	@ExceptionHandler(InvalidAmountException.class)
	public ModelAndView handleInvalidAmountException(Exception e) {
		return new ModelAndView("bankingWithdrawMoney","errorMessage",e.getMessage());
		
	}
	@ExceptionHandler(InvalidAccountTypeException.class)
	public ModelAndView handleInvalidAccountTypeException(Exception e) {
		return new ModelAndView("bankingOpenAccount","errorMessage",e.getMessage());
		
	}
	@ExceptionHandler(InvalidPinNumberException.class)
	public ModelAndView handleInvalidPinNumberException(Exception e) {
		return new ModelAndView("bankingFundTransfer","errorMessage",e.getMessage());
		
	}
	

}
