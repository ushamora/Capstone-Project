package com.wipro.usha.service;



import com.wipro.usha.dto.AccountDTO;

public interface AccountService {

	AccountDTO saveAccount(AccountDTO accountDTO);

	AccountDTO getAccountById(Long id);

	

}
