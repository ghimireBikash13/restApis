package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtos.CustomerDto;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@GetMapping(value = "")
	public CustomerDto getDummyCustomer() {

		CustomerDto dto = new CustomerDto();

		dto.setName("Bikash Ghimire");
		dto.setAddress("9335 lee highway");
		dto.setPhone("2524567789");
		dto.setAge(27);
		dto.setGender("Male");

		return dto;

	}

	@PostMapping(value = "")
	public void createCustomer(@RequestBody CustomerDto dto) {
		System.out.println(dto.toString());
	}

}
