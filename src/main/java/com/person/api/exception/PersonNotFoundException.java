package com.person.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/***
 * 
 * @author dionatan
 *
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public PersonNotFoundException(Long id) {
        super("Person not found with ID " + id);
    }

}
