package com.wipro.usha.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wipro.usha.dto.CustomerDTO;


@FeignClient(name = "customer-service", url = "http://localhost:8085")
public interface CustomerClient {

    @GetMapping("/api/customer/getCustomer/{id}")
    CustomerDTO getCustomerById(@PathVariable("id") Long id);
}