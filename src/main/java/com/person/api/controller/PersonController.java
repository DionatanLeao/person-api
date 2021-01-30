package com.person.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 * 
 * @author dionatan
 *
 */

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {
	
	public String getBook() {
		return "API Test";
	}

}
