package com.person.api.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/***
 * 
 * @author dionatan
 *
 */

@Getter
@AllArgsConstructor
public enum PhoneType {
	
	HOME("Home"),
	MOBILE("Mobile"),
	COMMERCIAL("Commercial");
	
	private final String description;
}
