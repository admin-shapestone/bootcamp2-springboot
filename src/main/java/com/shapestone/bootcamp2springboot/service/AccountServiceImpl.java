package com.shapestone.bootcamp2springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shapestone.bootcamp2springboot.model.Account;
import com.shapestone.bootcamp2springboot.repository.AccountRepository;
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account saveAccount(Account account) {

		return accountRepository.save(account);
	}

	@Override
	public Account updateAccount(Account account) {
		return accountRepository.save(account);
	}

	@Override
	public void deleteAccount(Account account) {
		
		accountRepository.delete(account);

	}

	@Override
	public Account findByAccountId(Long accountId) {
		return accountRepository.findById(accountId).get();
	}

	public List<Account> findAll() {
		return accountRepository.findAll();
	}

}
