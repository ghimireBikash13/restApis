package com.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dtos.AirLinesDto;
import com.dtos.CustomerDto;
import com.service.AirLinesService;

@RestController
@RequestMapping("/airline")
public class AirLinesController {

	@Autowired
	private AirLinesService airlinesservice;

	@GetMapping(value = "")
	public AirLinesDto getInfoByFlightNumber() {

		return airlinesservice.getFlightDetails();

	}
	
    @GetMapping("/{flightnum}")
	public AirLinesDto getInfoOfFlightPath(@PathVariable(value="flightnum") String flightnumber) {
		return airlinesservice.getFlightDetails1(flightnumber);

	}

    @PostMapping("")
	public void addCustomer(@Valid @RequestBody CustomerDto dto) {
		System.out.println(dto.toString());
	}
}