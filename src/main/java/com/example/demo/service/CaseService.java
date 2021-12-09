package com.example.demo.service;

import javax.ws.rs.QueryParam;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Service
public class CaseService {
	
	public String test(String string, String control) {
		if(control.toLowerCase().equals("upper-case")) {
			string = string.toUpperCase();
			return string;
		}else if(control.toLowerCase().equals("lower-case")) {
			string = string.toLowerCase();
			return string;
		}
		return string;
	}
}
