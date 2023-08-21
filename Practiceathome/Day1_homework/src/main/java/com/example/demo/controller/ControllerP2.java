package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;

@RestController
public class ControllerP2 {
	@GetMapping("/address")
	public List<Address> getAddress(){
		return Arrays.asList(new Address("Sudhakar.s",56,"Nehru street",642107,"pollachi","Coimbatore","TamilNadu","India"));
	}
}
