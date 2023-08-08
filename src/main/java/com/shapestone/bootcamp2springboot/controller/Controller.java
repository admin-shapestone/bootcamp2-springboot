package com.shapestone.bootcamp2springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shapestone.bootcamp2springboot.model.Account;
import com.shapestone.bootcamp2springboot.service.AccountService;

@RestController
public class Controller {
	@Autowired
	private AccountService accountService;

	@PostMapping(value = "/saveAccount")
	public Account saveAccount(@RequestBody Account account) {
		accountService.saveAccount(account);
		return account;

	}

	// To find All accounts from Data base
	@GetMapping(value = "getAllAccounts")
	public List<Account> findAll() {
		return accountService.findAll();
	}

	// update Account
	@PutMapping("updateAccount")
	public Account updateAccount(@RequestBody Account account) {

		return accountService.updateAccount(account);

	}

	// Delete Account
	@DeleteMapping("deleteAccount")
	public String deleteAccount(@RequestParam Account accountId) {
		accountService.deleteAccount(accountId);
		return "Account Deleted";

	}

}
