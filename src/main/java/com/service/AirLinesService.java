package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dtos.AirLinesDto;
import com.dtos.CustomerDto;

@Service
public class AirLinesService {

	public AirLinesDto getFlightDetails() {

		AirLinesDto a = new AirLinesDto();
		a.setFlightName("Quatar Airlines");
		a.setFlightNumber("AWS-2234");
		a.setSource("IAD");
		a.setDestination("ORD");

		List<CustomerDto> customers = new ArrayList<CustomerDto>();

		CustomerDto c1 = new CustomerDto();
		c1.setName("Bikash Ghimire");
		c1.setAddress("118 Meredith ct");
		c1.setPhone("2523663957");
		c1.setAge(27);
		c1.setGender("Male");
		c1.setsSN("634870093");

		CustomerDto c2 = new CustomerDto();
		c2.setName("Akash Acharya");
		c2.setAddress("1010 Jefferys ct");
		c2.setPhone("4486559876");
		c2.setAge(28);
		c2.setGender("Male");
		c2.setsSN("335674378");

		CustomerDto c3 = new CustomerDto();
		c3.setName("Dipsa Tendukar");
		c3.setAddress("1213 neblick rd");
		c3.setPhone("6696579845");
		c3.setAge(24);
		c3.setGender("Female");
		c3.setsSN("984650098");

		CustomerDto c4 = new CustomerDto();
		c4.setName("Bikash Thapa");
		c4.setAddress("205 ocean city");
		c4.setPhone("4496540097");
		c4.setAge(28);
		c4.setGender("Male");
		c4.setsSN("003589875");

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);

		a.setCustomers(customers);
		return a;
	}

	public AirLinesDto getFlightDetails1(String flightNum) {

		AirLinesDto a = new AirLinesDto();

		a.setFlightName("United Airlines");
		a.setFlightNumber("flightNum");
		a.setSource("Buoyant flight");
		a.setDestination("Apex");

		List<CustomerDto> customers = new ArrayList<CustomerDto>();

		CustomerDto c1 = new CustomerDto();
		c1.setName("Rabindra Bastola");
		c1.setAddress("915 prespective ave");
		c1.setPhone("3452876657");
		c1.setAge(39);
		c1.setGender("Male");
		c1.setsSN("009478878");

		CustomerDto c2 = new CustomerDto();
		c2.setName("Arvind Uraw");
		c2.setAddress("Jhumka Faram,Nepal");
		c2.setPhone("9845678976");
		c2.setAge(29);
		c2.setGender("Male");
		c2.setsSN("998583348");

		CustomerDto c3 = new CustomerDto();
		c3.setName("Seema Poudyal");
		c3.setAddress("Khanar,Itahari,Nepal");
		c3.setPhone("9842267457");
		c3.setAge(27);
		c3.setGender("Female");
		c3.setsSN("003457768");

		CustomerDto c4 = new CustomerDto();
		c4.setName("Simran Chitrakar");
		c4.setAddress("1020 Brandywane lane");
		c4.setPhone("2523663958");
		c4.setAge(24);
		c4.setGender("Female");
		c4.setsSN("445890076");

		customers.add(c1);
		customers.add(c2);
		customers.add(c3);
		customers.add(c4);

		a.setCustomers(customers);
		return a;

	}

}
