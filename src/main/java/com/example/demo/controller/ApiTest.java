package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTest {
	@GetMapping("/firstApi")
	public String test() {
		return "hello from first api";
	}
	
}
