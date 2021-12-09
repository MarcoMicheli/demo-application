package com.example.demo.controller;



import javax.websocket.server.PathParam;
import javax.ws.rs.QueryParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiTest {
	
	@GetMapping("/firstApi/{string}")
	public String test(@PathVariable String string, @QueryParam("control") String control) {
		if(control.equals("UPPER-CASE")) {
			string = string.toUpperCase();
			return string;
		}else if(control.equals("LOWER-CASE")) {
			string = string.toLowerCase();
			return string;
		}
		return string;
	}
}
