package com.wipro.usha.service;

import com.wipro.usha.dto.CustomerDTO;

public interface CustomerService {

	CustomerDTO createCustomer(CustomerDTO customerDto);

	CustomerDTO getCustomerById(Long id);

}
