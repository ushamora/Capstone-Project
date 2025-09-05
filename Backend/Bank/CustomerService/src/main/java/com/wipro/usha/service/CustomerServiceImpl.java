package com.wipro.usha.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.usha.dto.CustomerDTO;
import com.wipro.usha.entities.Customer;
import com.wipro.usha.exp.CustomerNotFoundException;
import com.wipro.usha.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public CustomerDTO createCustomer(CustomerDTO customerDto) {
	    Customer customer=Customer.builder()
	    		                  .name(customerDto.getName())
	    		                  .email(customerDto.getEmail())
	    		                  .mobileNumber(customerDto.getMobileNumber())
	    		                  .address(customerDto.getAddress())
	    		                  .age(customerDto.getAge())
	    		                  .gender(customerDto.getGender())
	    		                  .kyc(customerDto.getKyc() != null ? customerDto.getKyc() : "PENDING")
	    		                  .build();
	    Customer saved = customerRepository.save(customer);
        return convertToDTO(saved);
	}
	
	


	 @Override
	 public CustomerDTO getCustomerById(Long id) {
		 Customer customer =customerRepository.findById(id)
	                .orElseThrow(() -> new CustomerNotFoundException("Customer not found with id: " + id));
	        return convertToDTO(customer);
	 }
	 
	 private CustomerDTO convertToDTO(Customer customer) {
	        return CustomerDTO.builder()
	                .id(customer.getId())
	                .name(customer.getName())
	                .email(customer.getEmail())
	                .mobileNumber(customer.getMobileNumber())
	                .address(customer.getAddress())
	                .age(customer.getAge())
	                .gender(customer.getGender())
	                .kyc(customer.getKyc())
	                .build();
	    }
}
