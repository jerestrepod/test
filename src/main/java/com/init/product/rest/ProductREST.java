package com.init.product.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ProductREST {

//	@GetMapping
	@RequestMapping(value="hi", method=RequestMethod.GET)
	public String hello() {
		return "hello world";
	}
}
