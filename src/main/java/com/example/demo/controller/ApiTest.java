package com.example.demo.controller;



import javax.websocket.server.PathParam;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.Services;


@RestController
public class ApiTest {
	@Autowired
	private Services service;
	@GetMapping("/firstApi/{string}")
	public String newTest(@PathVariable String string, @QueryParam("control") String control) {
		return service.test(string, control);
	}
	
}
