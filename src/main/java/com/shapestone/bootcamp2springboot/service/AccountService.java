package com.shapestone.bootcamp2springboot.service;

import java.util.List;

import com.shapestone.bootcamp2springboot.model.Account;

public interface AccountService {

	public Account saveAccount(Account account);

	public Account updateAccount(Account account);

	public Account findByAccountId(Long accountId);

	public List<Account> findAll();

	public void deleteAccount(Account account);

}
